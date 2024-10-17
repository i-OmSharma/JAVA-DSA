//when we are talking Static context where it is mentioned as static.
//class Test is initialized inside the InnerClasses class hence it is not dependent on the objects of InnerClasses class.
//But main and Test can have instances of each other.

package com.om.staticexample;
//Outside classes can't be static. Only inner classes can be static
public class InnerClasses { //Because itself is not dependent on any other class
    //class Test {//But this class is dependent on outer class
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

//        InnerClasses ins = new InnerClasses();// creating the instance of the outermost class "InnerClasses".
                                                //we have to use this when we are not using the inner class 'Static'.
//        Test a = ins.new Test("Kunal");
//        Test b = ins.new Test("cat");

        // when the Test is static then how these are having individual identities.
        Test a = new Test("Kunal");
        Test b = new Test("cat");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

/*
 since it doesn't depend on obj and obj are created at runtime
 the obj are created at runtime and static stuff don't have to do anything with obj
 so static stuff(variable, method, class level things) they are resolved using the compile time
*/

//System.out.println(b.name); --> Syst em is a class; out is a variable; println() is function/method
