package com.om.interfaces.extendDemo2;

public class Main implements A, B {
    @Override // the access modifiers for the overridden methods should be better,
    // like if its protected then it should be public, not privet. it should not be more restrictive
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting(); // we have to call the static interface method with the name of the interface
    }
}
