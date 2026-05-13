package com.example.J.gg_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/champion")
public class ChampionController {

    @Autowired
    private ChampionDAO championDAO;

    @GetMapping("/")
    public ChampionList getAllChampions() {

        return championDAO.getAllChampions();
    }
}
