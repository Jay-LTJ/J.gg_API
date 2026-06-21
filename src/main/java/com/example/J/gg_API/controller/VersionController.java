package com.example.J.gg_API.controller;

import com.example.J.gg_API.entity.version;
import com.example.J.gg_API.service.versionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/version")
public class VersionController {

    @Autowired
    private versionService versionService;

    @GetMapping("/versions")
    public List<version> getCurrentVersion(){
        return versionService.findAllVersions();
    }


}
