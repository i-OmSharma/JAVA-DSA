package com.om.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts the Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops the Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate the Eleectric Engine");
    }
}
