package com.kansascitycoffee.sourced.models;

import javax.persistence.*;

@Entity
public class Cafe {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;
//    private static int nextId = 1;

    private String name;
    private String location;
    private String description;

//    public Cafe() {
//        this.id = nextId;
//        nextId++;
//    }

    public Cafe(String name, String location, String description){
        this();
        this.name = name;
        this.location = location;
        this.description = description;
    }

    public Cafe(){}

    public int getId() {
        return id;
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

}
