package com.example.J.gg_API.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleid")
    private int roleId;

    @Column(name = "rolename")
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private Set<Champion> champions = new HashSet<Champion>();

    public roles() {}

    public roles(String roleName) {
        this.roleName = roleName;

    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
