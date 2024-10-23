// * public static void main:-
//main is declared as static method, static means we can use main method without creating an object of that class
//main is very first thing run when ever we run java program, if main is not there we aren't able to run java program
/*if we don't put it as static, in order to run anything that is inside a class u have to create an object of that class
if access something from the class, any instance variable any method you have to create an object of that class is needed.
But how can we create an object, how can we run the program to create the object if main the very first thing which is running.
Hence, u shouldn't be able to run main without creating any object of the class in which the main is, you should be able to  run this main function
without creating an object of the class Main
so before Object or anything is created, it should allow u to run main.
This all Static method, static variable all belong to class not to the object.
 */
package com.om.staticexample;

// * when a member is declared static it can be accessed before any of the object of the class is being created.
//And without referencing that object. like without doing Om is an object of Human class, so without using object of the class you can access these variables
//even if you don't create the object
//Static variable are not dependent on the Objects

// * We can declare both function-methods and variables as Static
// the most common is 'public static void main'

public class Main {
    public static void main(String[] args) {
//        Human Om = new Human(20,"Om", 100000, false);
//        Human Viva = new Human(27,"Viva", 20000, true);
//        Human Sahil = new Human(12, "Sahil", 00000, false);

//        System.out.println(Om.population);
//        System.out.println(Viva.population);
//        System.out.println(Sahil.population);


//            *Accessing Static variable, modifying Static variable, declaring Static variable via the reference variable via the object name it will work but still don't do it
//            *convention is use class name

//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
        //greeting();// inside a static non-static methods can't be called, Non-static method 'greeting()' cannot be referenced from a static context
                    //we can't use anything which is non-static inside a static
    }
    //Static method use only static data, it cant access non-static data, non-static data belongs to

    //this is non-dependent on objects, this doesn't belong to an instance
    static void fun () {
//        greeting();//u can't use this because it requires an instance.
                    //but the function you're using it in does not depend on instances
        //u cant access a non-static member without explicitly mentioning an object reference to it

        //you can't access non-static stuff without referencing their instance in a static context
        //here I'm referencing it
//        Main obj = new Main();
//        obj.greeting();

    }
    void fun2() {
        greeting();
    }

    //this dependent on objects, belong to instance
    void greeting() { //non-static data like this belongs to an instance,we know something which is not static belongs to Object
        System.out.println("Hello");//this is going to have an instance and the static one is not going to have one
        //it's meaning less that without somehow resolving which instance of a class you are talking about
        //for static constraints u don't have an instance that's why u cant really use something that is not static inside that is  static

        //without specifying which instance this belongs to we cant use it

        //we can use static one inside the non-static one.

        //Static method can be  directly accessed by the class name, don't need the object
        //can't refer to "this" keyword or the "super" keyword.
    }
}


