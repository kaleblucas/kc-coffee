package com.kansascitycoffee.sourced.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cafe {
    @Id
    @GeneratedValue
    private int id;
//    private static int nextId = 1;

    private String name;
    private String location;

//    public Cafe() {
//        this.id = nextId;
//        nextId++;
//    }

    public Cafe(String name, String location){
        this();
        this.name = name;
        this.location = location;
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
}
