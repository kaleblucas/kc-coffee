package com.kansascitycoffee.sourced.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Origin {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;

    @NotBlank
    @Size(max = 99)
    private String region;

    @NotBlank
    @Size(max = 99)
    private String name;

    @NotBlank
    @Size(max = 500)
    private String description;

    @ManyToMany
    private List<Cafe> cafes = new ArrayList<>();


    public Origin(){}

    public Origin(String region, String name, String description){
        this();
        this.region = region;
        this.name = name;
        this.description = description;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cafe> getCafes() {
        return cafes;
    }

    public void setCafes(List<Cafe> cafes) {
        this.cafes = cafes;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
