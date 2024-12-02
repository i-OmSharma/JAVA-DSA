package com.om.interfaces;

public interface Engine {

    static final int PRICE = 300; // its static and final by default that's why its blur.

    void start();
    void stop();
    void acc();
}
