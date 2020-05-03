package com.kansascitycoffee.sourced.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Coffee {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;

    @NotBlank
    @Size(max = 99)
    private String name;

    @NotBlank
    @Size(max = 500)
    private String description;

    @ManyToOne
    private Cafe cafe;

    @ManyToOne
    private Farm farm;

    public Coffee(){}

    public Coffee(Cafe cafe, Farm farm, String name, String description){
        this();
        this.cafe = cafe;
        this.farm = farm;
        this.name = name;
        this.description = description;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
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
