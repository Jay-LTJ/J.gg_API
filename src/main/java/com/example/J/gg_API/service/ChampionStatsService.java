package com.example.J.gg_API.service;


import com.example.J.gg_API.entity.Champion;
import com.example.J.gg_API.entity.ChampionStats;
import com.example.J.gg_API.repositories.championStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tools.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChampionStatsService {

    @Autowired
    private championStatsRepository championStatsRepository;




    public List<ChampionStats> lolJsonToChampStats(JsonNode championListJson, List<Champion> championList){
        System.out.println("lolJsonToChampStats");

        List<ChampionStats> statList = new ArrayList<>();

        for(JsonNode championJson : championListJson){

            Champion champ = new Champion();

            for (Champion champion : championList) {
                if (championJson.get("name").asString().equals(champion.getChampionName())) {
                    champ = champion;
                    break;
                }
            }

            ChampionStats stats = new ChampionStats(

                    championJson.get("stats").get("health").get("flat").asFloat(),
                    championJson.get("stats").get("health").get("percent").asFloat(),
                    championJson.get("stats").get("health").get("perLevel").asFloat(),
                    championJson.get("stats").get("health").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("healthRegen").get("flat").asFloat(),
                    championJson.get("stats").get("healthRegen").get("percent").asFloat(),
                    championJson.get("stats").get("healthRegen").get("perLevel").asFloat(),
                    championJson.get("stats").get("healthRegen").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("mana").get("flat").asFloat(),
                    championJson.get("stats").get("mana").get("percent").asFloat(),
                    championJson.get("stats").get("mana").get("perLevel").asFloat(),
                    championJson.get("stats").get("mana").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("manaRegen").get("flat").asFloat(),
                    championJson.get("stats").get("manaRegen").get("percent").asFloat(),
                    championJson.get("stats").get("manaRegen").get("perLevel").asFloat(),
                    championJson.get("stats").get("manaRegen").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("armor").get("flat").asFloat(),
                    championJson.get("stats").get("armor").get("percent").asFloat(),
                    championJson.get("stats").get("armor").get("perLevel").asFloat(),
                    championJson.get("stats").get("armor").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("magicResistance").get("flat").asFloat(),
                    championJson.get("stats").get("magicResistance").get("percent").asFloat(),
                    championJson.get("stats").get("magicResistance").get("perLevel").asFloat(),
                    championJson.get("stats").get("magicResistance").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("attackDamage").get("flat").asFloat(),
                    championJson.get("stats").get("attackDamage").get("percent").asFloat(),
                    championJson.get("stats").get("attackDamage").get("perLevel").asFloat(),
                    championJson.get("stats").get("attackDamage").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("movespeed").get("flat").asFloat(),
                    championJson.get("stats").get("movespeed").get("percent").asFloat(),
                    championJson.get("stats").get("movespeed").get("perLevel").asFloat(),
                    championJson.get("stats").get("movespeed").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("criticalStrikeDamage").get("flat").asFloat(),
                    championJson.get("stats").get("criticalStrikeDamage").get("percent").asFloat(),
                    championJson.get("stats").get("criticalStrikeDamage").get("perLevel").asFloat(),
                    championJson.get("stats").get("criticalStrikeDamage").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("criticalStrikeDamageModifier").get("flat").asFloat(),
                    championJson.get("stats").get("criticalStrikeDamageModifier").get("percent").asFloat(),
                    championJson.get("stats").get("criticalStrikeDamageModifier").get("perLevel").asFloat(),
                    championJson.get("stats").get("criticalStrikeDamageModifier").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("attackSpeed").get("flat").asFloat(),
                    championJson.get("stats").get("attackSpeed").get("percent").asFloat(),
                    championJson.get("stats").get("attackSpeed").get("perLevel").asFloat(),
                    championJson.get("stats").get("attackSpeed").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("attackSpeedRatio").get("flat").asFloat(),
                    championJson.get("stats").get("attackSpeedRatio").get("percent").asFloat(),
                    championJson.get("stats").get("attackSpeedRatio").get("perLevel").asFloat(),
                    championJson.get("stats").get("attackSpeedRatio").get("percentPerLevel").asFloat(),
                    championJson.get("stats").get("attackRange").get("flat").asFloat(),
                    championJson.get("stats").get("attackRange").get("percent").asFloat(),
                    championJson.get("stats").get("attackRange").get("perLevel").asFloat(),
                    championJson.get("stats").get("attackRange").get("percentPerLevel").asFloat(),
                    champ
            );

            statList.add(stats);

        }

        return statList;
    }

    public void saveStatList(List<ChampionStats> statsList) {
        System.out.println("saveStatList");

        championStatsRepository.saveAll(statsList);
    }

    public  void clearChampionStats() throws IOException, InterruptedException {
        System.out.println("clearChampionStats");

        try{
            championStatsRepository.deleteAll();
            System.out.println("champion stats table cleared");
        }catch(Exception e){
            System.out.println("clearChampionStats error: " + e.getMessage());
        }


    }

    public void resetChampionStatIDs() throws IOException, InterruptedException {
        System.out.println("resetChampionStatIDs");
        championStatsRepository.deleteAll();
    }


}
