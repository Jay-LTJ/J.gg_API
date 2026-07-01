package com.example.J.gg_API.service;

import com.example.J.gg_API.entity.version;
import com.example.J.gg_API.externalApi.communityDragonConnection;
import com.example.J.gg_API.repositories.versionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class VersionService {

    @Autowired
    private versionRepository versionRepository;

    @Autowired
    private communityDragonConnection dragonConnection;



    public boolean versionCheck() throws IOException, InterruptedException {
        System.out.println("versionCheck");

        boolean check = false;

        for(version version : findAllVersions()){
            if(version.getVersionName().equals(dragonConnection.getLatestVersion())){
               check = true;
            }
        }
        System.out.println("versionCheck check result: " + check);
        return check;
    }


    public void updateVersion() throws IOException, InterruptedException {
        System.out.println("updateVersion");

        try{
            version newVersion = new version();
            newVersion.setVersionName(dragonConnection.getLatestVersion());

            versionRepository.saveAndFlush(newVersion);
            System.out.println("version updated");

        }catch(Exception e){

            System.out.println("version update Failed : " + e.getMessage());

        }
    }

    public List<version> findAllVersions() {
        System.out.println("findAllVersions");
        return versionRepository.findAll();
    }

    public version findById(Integer id) {
        return versionRepository.findById(id).orElse(null);
    }
}
