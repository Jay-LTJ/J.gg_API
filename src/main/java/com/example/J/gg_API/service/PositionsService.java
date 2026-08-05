package com.example.J.gg_API.service;


import com.example.J.gg_API.entity.positions;
import com.example.J.gg_API.repositories.positionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tools.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PositionsService {

    @Autowired
    private positionsRepository positionsRepository;


    public Set<String> jsonToPositionSet(JsonNode championJson){
        System.out.print("JsonToPositionSet");
        Set<String> positions = new HashSet<String>();

        for(JsonNode champion : championJson){

            for(JsonNode position : champion.get("positions")){
                positions.add(position.asString());
            }

        }
        return positions;
    }

    public void savePositionList(List<positions> positionsList){
        System.out.println("savePositionList");
        positionsRepository.saveAll(positionsList);
    }

    public List<positions> positionSetToList(Set<String> positionSet){
        System.out.print("positionSetToList");
        List<positions> positionsList = new ArrayList<positions>();

        for(String position : positionSet){
            positions temp = new positions(position);
            positionsList.add(temp);
        }
        return positionsList;

    }

    public  void clearPositions() throws IOException, InterruptedException {
        System.out.println("clearPositions");

        try{
            positionsRepository.deleteAll();
            System.out.println("position table cleared");
        }catch(Exception e){
            System.out.println("clearPosition error: " + e.getMessage());
        }


    }

    public void resetPositionIds(){
        System.out.println("resetPositionIds");
        positionsRepository.resetPositionIDs();
    }

}
