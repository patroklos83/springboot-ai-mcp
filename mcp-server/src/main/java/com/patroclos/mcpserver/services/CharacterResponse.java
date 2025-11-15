package com.patroclos.mcpserver.services;

import java.util.List;

import lombok.Data;

@Data
public class CharacterResponse {
    private List<CharacterItem> items;
    private Meta meta;
    private Links links;
}
