package com.example.J.gg_API.controller;

import com.example.J.gg_API.ChampionList;
import com.example.J.gg_API.externalApi.LolStaticDataConnection;
import com.example.J.gg_API.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/champion")
public class ChampionController {

    @Autowired
    private ChampionService championService;

    @Autowired
    private VersionService versionService;

    @Autowired
    private LolStaticDataConnection lolStaticDataConnection;

    @Autowired
    private ChampionStatsService championStatsService;

    @Autowired
    private PositionsService positionsService;

    @Autowired
    private RolesService rolesService;

//    @GetMapping("/")
//    public ChampionList getAllChampions() throws IOException, InterruptedException {
//
//        return championService.getAllChampions();
//    }

    @GetMapping("/update")
    public void updateChampions() throws IOException, InterruptedException {
        System.out.println("updateChampions");

    }

    @GetMapping("/set")
    public void setChampions() throws IOException, InterruptedException {
        System.out.println("setChampions");

        championService.setChampionsDb();
    }

    @GetMapping("/clear")
    public void clearChampions() throws IOException, InterruptedException {
        System.out.println("clearChampions");

        championService.clearChampions();
        championService.resetChampIDs();

        championStatsService.clearChampionStats();
        championStatsService.resetChampionStatIDs();


    }

    @GetMapping("test")
    public void test() throws IOException, InterruptedException {
        System.out.println("test");

        championService.champStaticDataToStats();
    }
}
