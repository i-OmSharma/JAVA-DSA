//every class has Object as a superClass
//super directly above its one(C->B->A)
//u can use super instead of this, if u want to explicitly refer something over in the parent class
//in the hierarchy of classes, if the super class constructor require some parameters then all the subclass must pass those parameters, up the line
//super class is initialised first, subclass care about the parent class, subclass require prerequisite of parent class and the parent class has no  knowledge of the subclass
//super class variable can be used to reference any object to that derived class , hence we are able to pass BoxWeight object to the Box constructor
package com.om.Properties.inheritance;

public class BoxWeight extends Box {
    double weight;

     BoxWeight () {
        this.weight = -4;
//        this.l; can't use it coz its private.
    }

    static void greeting() {
        System.out.println("I'm in the BoxWeight class");
     }
    BoxWeight(BoxWeight other ) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);//cal the parent class constructor
        this.weight = weight;
    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l,h,w);//cal the parent class constructor
        this.weight = weight;
    }

}

//the subclass include all the member of its parent class or superclass, it will not be able to access those member of the
// parent class that have been declared as "privet".

