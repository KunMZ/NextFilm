package com.xx.nextfilm.dto.editor;

import com.xx.nextfilm.dto.shower.ActorShower2;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CuiH on 2016/5/16.
 */
public class FilmEditor {

    private Long id;

    @NotEmpty
    private String name;
    private String alias;
    @NotEmpty
    private String brief;
    @NotEmpty
    private String language;
    @NotEmpty
    private String length;
    @NotEmpty
    private String onDate;
    @NotEmpty
    private String imageUrl;
    @NotEmpty
    private String category;
    @NotEmpty
    private String type;

    private List<ActorShower2> ownedDirectors = new ArrayList<ActorShower2>();
    private List<ActorShower2> ownedActors = new ArrayList<ActorShower2>();


    private List<Long> actors = new ArrayList<Long>();
    private List<Long> directors = new ArrayList<Long>();


    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getOnDate() {
        return onDate;
    }

    public void setOnDate(String onDate) {
        this.onDate = onDate;
    }


    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<ActorShower2> getOwnedDirectors() {
        return ownedDirectors;
    }

    public void setOwnedDirectors(List<ActorShower2> ownedDirectors) {
        this.ownedDirectors = ownedDirectors;
    }


    public List<ActorShower2> getOwnedActors() {
        return ownedActors;
    }

    public void setOwnedActors(List<ActorShower2> ownedActors) {
        this.ownedActors = ownedActors;
    }


    public List<Long> getActors() {
        return actors;
    }

    public void setActors(List<Long> actors) {
        this.actors = actors;
    }


    public List<Long> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Long> directors) {
        this.directors = directors;
    }

}
