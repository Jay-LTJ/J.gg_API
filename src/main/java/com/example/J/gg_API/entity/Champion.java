package com.example.J.gg_API.entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name="champs")
public class Champion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="champid")
    private int championId;

    @Column(name = "champname")
    private String championName;

    @Column(name = "champtitle")
    private String championTitle;

    @Column(name = "champfullname")
    private String championFullName;

    @Column(name = "champicon")
    private String championIcon;

    @Column(name = "champresource")
    private String championResource;

    @Column(name = "champattacktype")
    private String championAttackType;

    @Column(name = "champadaptivetype")
    private String championAdaptiveType;

    @ManyToMany(cascade =  {CascadeType.ALL})
    @JoinTable(
            name = "champ_role",
            joinColumns = {@JoinColumn(name = "champid")},
            inverseJoinColumns = {@JoinColumn(name = "roleid")}
    )
    Set<roles> roles = new HashSet<roles>();

    @ManyToMany(cascade =  {CascadeType.ALL})
    @JoinTable(
            name = "champ_position",
            joinColumns = {@JoinColumn(name = "champid")},
            inverseJoinColumns = {@JoinColumn(name = "positionid")}
    )
    Set<positions> positionList = new HashSet<positions>();




    public Champion() {}

    public Champion(String championName, String championTitle, String championFullName, String championIcon, String championResource,String championAttackType, String championAdaptiveType) {
        this.championName = championName;
        this.championTitle = championTitle;
        this.championFullName = championFullName;
        this.championIcon = championIcon;
        this.championResource = championResource;
        this.championAttackType = championAttackType;
        this.championAdaptiveType = championAdaptiveType;

    }



    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
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
                '}';
    }
}
