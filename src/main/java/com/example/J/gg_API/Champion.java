package com.example.J.gg_API;

public class Champion {

    private String championName;
    private String championTitle;
    private String championFullName;
    private String championIcon;
    private String championResource;
    private String championAttackType;
    private String championAdaptiveType;
    private ChampionStats championStats;

    public Champion(String championName, String championTitle, String championFullName, String championIcon, String championResource,String championAttackType, String championAdaptiveType, ChampionStats championStats) {
        this.championName = championName;
        this.championTitle = championTitle;
        this.championFullName = championFullName;
        this.championIcon = championIcon;
        this.championResource = championResource;
        this.championAttackType = championAttackType;
        this.championAdaptiveType = championAdaptiveType;
        this.championStats = championStats;
    }

    public String getChampionName() {
        return championName;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public String getChampionTitle() {
        return championTitle;
    }

    public void setChampionTitle(String championTitle) {
        this.championTitle = championTitle;
    }

    public String getChampionFullName() {
        return championFullName;
    }

    public void setChampionFullName(String championFullName) {
        this.championFullName = championFullName;
    }

    public String getChampionIcon() {
        return championIcon;
    }

    public void setChampionIcon(String championIcon) {
        this.championIcon = championIcon;
    }

    public String getChampionResource() {
        return championResource;
    }

    public void setChampionResource(String championResource) {
        this.championResource = championResource;
    }

    public String getChampionAttackType() {
        return championAttackType;
    }

    public void setChampionAttackType(String championAttackType) {
        this.championAttackType = championAttackType;
    }

    public String getChampionAdaptiveType() {
        return championAdaptiveType;
    }

    public void setChampionAdaptiveType(String championAdaptiveType) {
        this.championAdaptiveType = championAdaptiveType;
    }

    public ChampionStats getChampionStats() {
        return championStats;
    }

    public void setChampionStats(ChampionStats championStats) {
        this.championStats = championStats;
    }

    @Override
    public String toString() {
        return "Champion{" +
                "championName='" + championName + '\'' +
                ", championTitle='" + championTitle + '\'' +
                ", championFullName='" + championFullName + '\'' +
                ", championIcon='" + championIcon + '\'' +
                ", championResource='" + championResource + '\'' +
                ", championAttackType='" + championAttackType + '\'' +
                ", championAdaptiveType='" + championAdaptiveType + '\'' +
                ", championStats=" + championStats +
                '}';
    }
}
