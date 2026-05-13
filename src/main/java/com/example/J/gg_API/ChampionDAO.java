package com.example.J.gg_API;

import org.springframework.stereotype.Repository;

@Repository
public class ChampionDAO {

    private static ChampionList champions;
    private DatabaseConnection databaseConnection = new DatabaseConnection();

    public ChampionList getAllChampions() {
        System.out.println("getAllChampions");
        return champions;
    }
}
