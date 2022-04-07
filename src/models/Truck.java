package models;

import enums.State;

public class Truck {
    private Integer id;
    private String name;
    private Driver driver;
    private State state;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", driver=" + driver +
                ", state=" + state +
                '}';
    }
}
