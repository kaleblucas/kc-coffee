package com.kansascitycoffee.sourced.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.ArrayList;


@Entity
public class Cafe {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;

    @NotBlank
    @Size(max = 99)
    private String name;


    @NotBlank
    @Size(max = 999)
    private String description;

    @ManyToMany
    private List<Origin> origins = new ArrayList<>();

    public Cafe(){}

    public Cafe(String name, String location, String description, List<Origin> origins){
        this();
        this.name = name;
        this.description = description;
        this.origins = origins;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Origin> getOrigins() {
        return origins;
    }

    public void setOrigins(List<Origin> origins) {
        this.origins = origins;
    }

}
