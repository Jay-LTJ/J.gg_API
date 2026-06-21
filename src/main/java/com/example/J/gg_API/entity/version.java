package com.example.J.gg_API.entity;

import jakarta.persistence.*;

@Entity
public class version {

    @Id
    @Column(name = "versionid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int versionId;

    @Column(name = "version")
    private String versionName;

    public version() {}

    public version(String versionName, int versionId) {}

    public int getVersionId() {
        return versionId;
    }

    public void setVersionId(int versionId) {
        this.versionId = versionId;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }
}
