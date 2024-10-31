package com.om.Properties.inheritance;

public class Main {
    public static void main(String[] args) {


        Box box1 = new Box(2);
//        Box box = new Box(box1);
//
//        BoxWeight box3 = new BoxWeight();

//        System.out.println(box1.weight+box3.h + " " + box3.weight );  if the obj is directly created of parent then
//        it will not be able to access the child props

//        Box box5 = new BoxWeight(2, 4, 5, 23);
//        System.out.println(box5.w);
        //System.out.println(box5.weight);
        // it's actually the type of reference variable the type of obj,
        // that determine what member can be accessed,
        //it's a reference type of Box, and it is referencing to an obj of type BoxWeight
        //it's not actually type of obj  that determines what members can be accessed,
        //it's the type of the reference variables
        //when reference of a subclass obj assigned to a super class obj variable,
        //u only have the access to only those part of the obj that are defined in super class

//        BoxWeight box6 = new Box(2, 4, 5);
//        System.out.println(box6);
        //there are many variables in both parent and child classes.
        //you are given access to variables that are in the ref i.e. BoxWeight
        //hence, you should have access to weight variable.
        //this also means, that the ones you are trying to access should be initialised.
        //but here, when the obj itself is of type parent class, how will you call the constructor of child class
        //parent class has no idea about weight
        //You can't have a child reference variable and a parent obj



        BoxPrize box = new BoxPrize(2,4,6);

        BoxWeight box9 = new BoxWeight();
        BoxWeight.greeting(); // u can inherit but can't override
        box1.greeting();

    }
}
