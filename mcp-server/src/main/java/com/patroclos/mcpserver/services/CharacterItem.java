package com.patroclos.mcpserver.services;

import lombok.Data;

@Data
public class CharacterItem {

    private int id;
    private String name;
    private String ki;
    private String maxKi;
    private String race;
    private String gender;
    private String description;
    private String image;
    private String affiliation;
    private String deletedAt;
}
