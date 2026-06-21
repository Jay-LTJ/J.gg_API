package com.example.J.gg_API.externalApi;

import org.springframework.stereotype.Repository;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//Class to access meraki analystics lol static data database
@Repository
public class LolStaticDataConnection {

    private final String link;
    private final HttpClient client;
    private final ObjectMapper objectMapper;

    public LolStaticDataConnection() {

        link = "https://cdn.merakianalytics.com/riot/lol/resources/latest/en-US/";
        client = HttpClient.newHttpClient();
        objectMapper = new ObjectMapper();
    }

    public JsonNode getChampionListJson() throws IOException, InterruptedException {

        String urlLink = link + "champions.json";

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlLink)).GET().build();
        HttpResponse<String> responce = client.send(request, HttpResponse.BodyHandlers.ofString());
        String temp = responce.body();

        return objectMapper.readTree(temp);
    }

    public JsonNode getItemListJson() throws IOException, InterruptedException {
        String urlLink = link + "items.json";

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlLink)).GET().build();
        HttpResponse<String> responce = client.send(request, HttpResponse.BodyHandlers.ofString());
        String temp = responce.body();
        System.out.println(objectMapper.readTree(temp));
        return objectMapper.readTree(temp);
    }

}
