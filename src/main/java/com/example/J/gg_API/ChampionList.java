package com.example.J.gg_API;

import java.util.ArrayList;
import java.util.List;

public class ChampionList {

    private List<Champion> champions;

    public List<Champion> getChampions() {
        if(champions==null){
            champions=new ArrayList<>();
        }
        return champions;
    }

    public void setChampions(List<Champion> champions) {
        this.champions = champions;
    }

}
