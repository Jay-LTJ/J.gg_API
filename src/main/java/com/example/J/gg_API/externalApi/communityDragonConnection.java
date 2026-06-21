package com.example.J.gg_API.externalApi;

import org.springframework.stereotype.Repository;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

@Repository
public class communityDragonConnection {

    private final String baseLink;
    private final HttpClient client;
    private final ObjectMapper objectMapper;

    public communityDragonConnection() {
        this.baseLink = "https://raw.communitydragon.org/latest/";
        this.client = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    public String getLatestVersion() throws IOException, InterruptedException {
        System.out.println("Getting latest version");

        String cdURL = baseLink + "content-metadata.json";
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(cdURL)).GET().build();
        HttpResponse<String> responce = client.send(request, HttpResponse.BodyHandlers.ofString());
        Map<String,String> map = objectMapper.readValue(responce.body(), new TypeReference<Map<String,String>>(){});

        System.out.println("Lol version gotten");
        return map.get("version");
    }


}
