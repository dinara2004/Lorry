package com.company;

import enums.State;

public class Lorry {
    private int id;
    private String name;
    private String driver;
    private State state;

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

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public static Lorry makeLorry(int id, String name, String driver, State state){
        Lorry lorry = new Lorry();
        lorry.id = id;
        lorry.name = name;
        lorry.driver = driver;
        lorry.state = state;
        return lorry;
    }
}
