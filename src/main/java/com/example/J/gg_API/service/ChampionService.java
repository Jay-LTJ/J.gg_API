package com.example.J.gg_API.service;

import com.example.J.gg_API.ChampionList;
import com.example.J.gg_API.entity.Champion;
import com.example.J.gg_API.entity.version;
import com.example.J.gg_API.externalApi.LolStaticDataConnection;
import com.example.J.gg_API.repositories.championRepository;
import org.springframework.stereotype.Service;
import tools.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChampionService {

    private static ChampionList champions;
    private final LolStaticDataConnection lolStaticDataConnection;
    private final versionService versionService;
    private final championRepository championRepository;

    public ChampionService(LolStaticDataConnection lolStaticDataConnection, versionService versionService, championRepository championRepository) {
        this.lolStaticDataConnection = new LolStaticDataConnection();
        this.versionService = versionService;
        this.championRepository = championRepository;
    }

    public ChampionList getAllChampions() throws IOException, InterruptedException {
        System.out.println("getAllChampions");
        JsonNode championJson = lolStaticDataConnection.getChampionListJson();


        return champions;
    }

    public void getItems() throws IOException, InterruptedException {
        System.out.println("getItems");
        JsonNode temp = lolStaticDataConnection.getItemListJson();
    }

    public void updateChampionsDb() throws IOException, InterruptedException {
        System.out.println("updateChampionsDb");


        if(!versionService.versionCheck()){
            versionService.updateVersion();
        }

        List<Champion> championList = champStaticDataToClasses();


    }

    public void setChampionsDb() throws IOException, InterruptedException {
        System.out.println("setChampionsDb");

        if(!versionService.versionCheck()){
            versionService.updateVersion();
        }

        List<Champion> championList = champStaticDataToClasses();

        try{
            championRepository.saveAll(championList);
            System.out.println("championList Set");
        }catch(Exception e){
            System.out.println("setChampionsDb error: " + e.getMessage());
        }



    }

    private List<Champion> champStaticDataToClasses() throws IOException, InterruptedException {
        System.out.println("champStaticDataToClasses");

        JsonNode championListJson = lolStaticDataConnection.getChampionListJson();


        List<Champion> championList = new ArrayList<>();

        for(JsonNode championJson : championListJson){

            Champion champion = new Champion(championJson.get("name").asString(),
                    championJson.get("title").asString(),
                    championJson.get("fullName").asString(),
                    championJson.get("icon").asString(),
                    championJson.get("resource").asString(),
                    championJson.get("attackType").asString(),
                    championJson.get("adaptiveType").asString());


            championList.add(champion);
        }
        return championList;
    }




}
