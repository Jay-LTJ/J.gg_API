package com.example.J.gg_API.controller;

import com.example.J.gg_API.ChampionList;
import com.example.J.gg_API.service.ChampionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/champion")
public class ChampionController {

    @Autowired
    private ChampionService championService;

    @GetMapping("/")
    public ChampionList getAllChampions() throws IOException, InterruptedException {

        return championService.getAllChampions();
    }

    @GetMapping("/item")
    public void test()throws IOException, InterruptedException {
        championService.getItems();
    }

    @GetMapping("/update")
    public void updateChampions() throws IOException, InterruptedException {
        System.out.println("updateChampions");
        championService.updateChampionsDb();
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
    }
}
