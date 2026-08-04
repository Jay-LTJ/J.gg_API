package com.example.J.gg_API.service;

import com.example.J.gg_API.ChampionList;
import com.example.J.gg_API.entity.*;
import com.example.J.gg_API.externalApi.LolStaticDataConnection;
import com.example.J.gg_API.repositories.championRepository;
import com.example.J.gg_API.repositories.championStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.node.ArrayNode;

import java.io.IOException;
import java.util.*;

@Service
public class ChampionService {

    @Autowired
    private  LolStaticDataConnection lolStaticDataConnection;

    @Autowired
    private  VersionService versionService;

    @Autowired
    private  championRepository championRepository;

    @Autowired
    private  ChampionStatsService championStatsService;

    @Autowired
    private  PositionsService positionsService;

    @Autowired
    private RolesService rolesService;





    public void getItems() throws IOException, InterruptedException {
        System.out.println("getItems");
        JsonNode temp = lolStaticDataConnection.getItemListJson();
    }

    public void setChampionsDb() throws IOException, InterruptedException {
        System.out.println("setChampionsDb");

        if(!versionService.versionCheck()){
            versionService.updateVersion();
        }

        JsonNode championJson = lolStaticDataConnection.getChampionListJson();

        List<Champion> championList = lolJsonToChampList(championJson);

        Set<String> positionSet = positionsService.jsonToPositionSet(championJson);
        List<positions> positionList = positionsService.positionSetToList(positionSet);
        positionsService.savePositionList(positionList);

        championList = addPositionsToChampionsList(championList,positionList,championJson);

//        Set<String> roleSet = rolesService.jsonToRolesSet(championJson);
//        List<roles> rolesList = rolesService.rolesSetToList(roleSet);
//        rolesService.saveRoleList(rolesList);
//
        saveChampionList(championList);
//
//        List<ChampionStats> championStatsList = championStatsService.lolJsonToChampStats(championJson,championList);
//        championStatsService.saveStatList(championStatsList);





        





    }

    private List<Champion> lolJsonToChampList(JsonNode championListJson) throws IOException, InterruptedException {
        System.out.println("lolJsonToChampList");

        List<Champion> championList = new ArrayList<>();


        for(JsonNode championJson : championListJson){

            System.out.println("championJson: " + championJson);

            Champion champion = new Champion(championJson.get("name").asString(),
                    championJson.get("title").asString(),
                    championJson.get("fullName").asString(),
                    championJson.get("icon").asString(),
                    championJson.get("resource").asString(),
                    championJson.get("attackType").asString(),
                    championJson.get("adaptiveType").asString()
            );

            championList.add(champion);


            //positionsList.add(championJson.get("positions").asString());

//            for(int i = 0 ;  i < championJson.get("roles").size(); i++){
//
//                rolesList.add(championJson.get("roles").get(i).asString());
//
//            }







//            for(roles currentRole : rolesList){
//
//            }



        }

        return championList;

    }

    private void saveChampionList(List<Champion> championList) throws IOException, InterruptedException {
        System.out.println("saveChampionList");

        championRepository.saveAll(championList);

    }


    public List<ChampionStats> champStaticDataToStats() throws IOException, InterruptedException {
        System.out.println("champStaticDatatoStats");

        JsonNode championListJson = lolStaticDataConnection.getChampionListJson();

        List<ChampionStats> championStatsList = new ArrayList<>();

        for(JsonNode championJson : championListJson){

            System.out.println("championJson: " + championJson);

            System.out.println("championStatsList: " + championJson.get("stats").get("health").get("flat").asString());



        }


        return championStatsList;

    }

    public  void clearChampions() throws IOException, InterruptedException {
        System.out.println("clearChampions");

        try{
            championRepository.deleteAll();
            System.out.println("champion table cleared");
        }catch(Exception e){
            System.out.println("clearChampions error: " + e.getMessage());
        }


    }

    public void resetChampIDs() throws IOException, InterruptedException {
        System.out.println("resetChampIDs");
        championRepository.resetChampIDs();
    }

    public List<Champion> addPositionsToChampionsList(List<Champion> championList, List<positions> positionsList , JsonNode championJson) throws IOException, InterruptedException {
        System.out.println("addPositionsToChampionsList");

        for(JsonNode champ:championJson){
            System.out.println("championJson: " + champ.get("positions"));
            Set<positions> positionSet = new HashSet<>();

            for(JsonNode position:champ.get("positions")){

                for(positions p:positionsList){

                    if(p.getPositionName().equals(position.asString())){
                        positionSet.add(p);
                    }

                }
            }

            for (Champion champion : championList) {

                if (champion.getChampionName().equals(champ.get("name").asString())) {
                    champion.setPositionList(positionSet);
                    break;
                }

            }
        }

        return championList;
    }



}
