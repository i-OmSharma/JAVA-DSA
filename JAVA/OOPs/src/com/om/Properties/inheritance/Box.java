package com.om.Properties.inheritance;

public class Box {
    private double l;
    double w;
    double h;

    Box () {
         this.h = -1;
         this.l = -1;
         this.w = -1;
    }
    // cube

    static void greeting() {
        System.out.println("I'm in Box class");
    }

    Box ( double side) {

        // super();//Object class

        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box (double l, double h, double w) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    
    Box (Box old) {
         this.h = old.h;
         this.l = old.l;
         this.w = old.w;
    }

    public void information () {
        System.out.println("Running the Box");
    }
}
