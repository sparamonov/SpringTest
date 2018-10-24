package ru.neyvabank.fileprocessing.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDto {
    private String id;
    private String name;

    @JsonProperty("otherId")
    public String getId() { return id; }

    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}