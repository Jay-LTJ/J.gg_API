package com.example.J.gg_API;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private Set<Champion> champions = new HashSet<Champion>();

    public roles() {}

    public roles(String roleName, int roleId) {
        this.roleName = roleName;
        this.roleId = roleId;
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
