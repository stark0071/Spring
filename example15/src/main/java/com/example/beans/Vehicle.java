package com.example.beans;

import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {

    String name = "Lamborghini";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name = " + name;
    }
}
