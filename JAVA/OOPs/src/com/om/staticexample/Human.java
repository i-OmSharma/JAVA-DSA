package com.om.staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; //population is common to all human beings

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        // Property that are not directly related to the object is static

        //this.population += 1;// Static is not really related to object
                             //this represents the object, the object reference

        Human.population += 1;// To access the static variable use the class name

        //When Om.population += 1;// when ever a new object is created that (object + population) when we put "this" over there
        //so this.population += 1; does Om does this object have a  variable known as population, it's like no does not
        //do the main "Human" class has the variable known as population, its like yes it does and this is the static variable, it's common to everyone
        //it's going to be increase it by one
        //the convention is to put class name because static variable don't make sense to go with the instance variable connection with the instance variable
        //coz they are apart from the instance variable

        //Accessing Static variable, modifying Static variable, declaring Static variable via the reference variable via the object name it will work but still don't do it
        //convention is use class name
    }
}
