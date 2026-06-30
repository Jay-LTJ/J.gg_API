package com.example.J.gg_API.service;


import com.example.J.gg_API.entity.roles;
import com.example.J.gg_API.repositories.rolesRepository;
import org.springframework.stereotype.Service;
import tools.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RolesService {

    private final rolesRepository rolesRepository;

    public RolesService(rolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }


    public Set<String> jsonToRolesSet(JsonNode championJson){
        System.out.print("JsonToRolesSet");
        Set<String> roles = new HashSet<String>();

        for(JsonNode champion : championJson){

            for(JsonNode role : champion.get("roles")){
                roles.add(role.asString());
            }

        }

        System.out.println("roles: " + roles);

        return roles;
    }

    public void saveRoleList(List<roles> roleList){
        System.out.println("saveRoleList");
        rolesRepository.saveAll(roleList);
    }

    public List<roles> rolesSetToList(Set<String> roleSet){
        System.out.println("rolesSetToList");

        List<roles> rolesList = new ArrayList<roles>();

        for(String role : roleSet){
            roles temp = new roles(role);
            rolesList.add(temp);
        }

        System.out.println("rolesList: " + rolesList);
        return rolesList;
    }

    public  void clearRoles() throws IOException, InterruptedException {
        System.out.println("clearRoles");

        try{
            rolesRepository.deleteAll();
            System.out.println("role table cleared");
        }catch(Exception e){
            System.out.println("clearRole error: " + e.getMessage());
        }


    }

}
