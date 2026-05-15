package com.example.J.gg_API;

import org.springframework.stereotype.Repository;
import tools.jackson.databind.JsonNode;

import java.io.IOException;

@Repository
public class ChampionDAO {

    private static ChampionList champions;
    private DatabaseConnection databaseConnection = new DatabaseConnection();

    public ChampionList getAllChampions() throws IOException, InterruptedException {
        System.out.println("getAllChampions");
        LolStaticDataConnection lolStaticDataConnection = new LolStaticDataConnection();
        JsonNode temp = lolStaticDataConnection.getChampionListJson();
        return champions;
    }

    public void getItems() throws IOException, InterruptedException {
        System.out.println("getItems");
        LolStaticDataConnection lolStaticDataConnection = new LolStaticDataConnection();
        JsonNode temp = lolStaticDataConnection.getItemListJson();
    }
}
