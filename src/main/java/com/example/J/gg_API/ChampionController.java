package com.example.J.gg_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.net.URI;

@RestController
@RequestMapping("/champion")
public class ChampionController {

    @Autowired
    private ChampionDAO championDAO;

    @GetMapping("/")
    public ChampionList getAllChampions() throws IOException, InterruptedException {

        return championDAO.getAllChampions();
    }

    @GetMapping("/item")
    public void test()throws IOException, InterruptedException {
        championDAO.getItems();
    }
}
