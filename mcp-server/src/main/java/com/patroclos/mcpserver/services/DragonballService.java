package com.patroclos.mcpserver.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DragonballService {

    private final RestTemplate restTemplate;

    public DragonballService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @Tool(description = "[Dragonball] Search and retrieve information about dragonball")
    public List<String> getDragonballCharacters() {

        String url = "https://dragonball-api.com/api/characters";

        CharacterResponse response = restTemplate.getForObject(url, CharacterResponse.class);

        if (response == null) return new ArrayList<>();
        
        var characters = response.getItems().stream()
        .map(d -> d.getName())
        .toList();

        return characters;
    }
    
    @Tool(description = "[Dragonball] Search and retrieve information about a dragonball character")
    public CharacterResponse getDragonballCharacterInfo(String character) {
        String url = "https://dragonball-api.com/api/characters";

        CharacterResponse response = restTemplate.getForObject(url, CharacterResponse.class);

        if (response == null) return new CharacterResponse();
        
        var items = response.getItems().stream()
        		.filter(d -> d.getName().equalsIgnoreCase(character))
		        .toList();
        
        response.setItems(items);

        return response;
    }
}
