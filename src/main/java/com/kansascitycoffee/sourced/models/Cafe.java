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
    @Size(max = 500)
    private String location;

    @NotBlank
    @Size(max = 999)
    private String description;

    @OneToMany
    @JoinColumn
    private List<Coffee> coffees = new ArrayList<>();

    public Cafe(){}

    public Cafe(String name, String location, String description, Farm farm){
        this();
        this.location = location;
        this.description = description;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }

    public void setCoffees(List<Coffee> coffees) {
        this.coffees = coffees;
    }

}
