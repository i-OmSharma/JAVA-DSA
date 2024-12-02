package com.om.interfaces.extendDemo2;

public interface A {

//As we know static method can't be inherited, can't be overridden
// it means it should have a body.
// Static methods are the once used only, it will be used from interface only.
// That's why static interface methods should have a body.



    static void greeting() {
        System.out.println("Im a static interface method ");
    } // we have to call the static interface method with the name of the interface

    default void fun(){
        System.out.println("Im in A ");
    }
}
