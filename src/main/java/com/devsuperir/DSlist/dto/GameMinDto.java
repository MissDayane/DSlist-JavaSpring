package com.devsuperir.DSlist.dto;

import com.devsuperir.DSlist.entities.Game;

public class GameMinDto {

    private final Long id;
    private final String title;
    private final Integer year;
    private final String shortDescription;
    private final String imgUrl;

    // Construtor que inicializa os campos
    public GameMinDto(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
