package com.kansascitycoffee.sourced.models;

public class Cafe {

    private int id;
    private static int nextId = 1;

    private String name;
    private CafeLocation location;

    public Cafe() {
        id = nextId;
        nextId++;
    }

    public Cafe(String name, CafeLocation location){
        super();
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CafeLocation getLocation() {
        return location;
    }

    public void setLocation(CafeLocation location) {
        this.location = location;
    }
}
