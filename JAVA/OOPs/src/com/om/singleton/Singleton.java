//it just a class in which we can create only one obj
//It restricts the instantiation of the class by making the constructor private, preventing the creation of new objects.
// Instead, it provides a method to return the single instance of the class, ensuring that only one object exists throughout the program.

package com.om.singleton;

public class Singleton {
     private Singleton () {

     }

     private static Singleton instance;//since instance is not going to depend on an object of this class 'public class Singleton'
                                //I'm not going to create an object of this class which is not allowed
                                //I'll only return this object 'private Singleton instance'
                                //that is created internally somewhere in this 'public static Singleton getInstance()'
                                //hence i can make as static as well.


     public static Singleton getInstance() {
        //check whether only 1 obj is created or not
         if (instance == null) {
             instance = new Singleton();
         }
         return instance;
     }

}
