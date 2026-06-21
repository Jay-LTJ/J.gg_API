package com.example.J.gg_API.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "position")
public class positions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "positionid")
    private int positionId;

    @Column(name = "positionname")
    private String positionName;

    @ManyToMany(mappedBy = "positionList")
    private Set<Champion> champions = new HashSet<Champion>();

    public positions() {}

    public positions(int positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
