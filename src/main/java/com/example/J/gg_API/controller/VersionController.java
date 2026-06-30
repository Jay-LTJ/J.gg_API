package com.example.J.gg_API.controller;

import com.example.J.gg_API.entity.version;
import com.example.J.gg_API.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/version")
public class VersionController {

    @Autowired
    private VersionService versionService;

    @GetMapping("/versions")
    public List<version> getCurrentVersion(){
        return versionService.findAllVersions();
    }


}
