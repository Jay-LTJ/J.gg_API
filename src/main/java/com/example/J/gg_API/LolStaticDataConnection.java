package com.example.J.gg_API;

public class LolStaticDataConnection {

    private String link;

    public LolStaticDataConnection() {
        link = "https://cdn.merakianalytics.com/riot/lol/resources/latest/en-US/";
    }

    public String getChampionLink(){
        return link + "champions";
    }

    public String getItemLink(){
        return link + "items";
    }

}
