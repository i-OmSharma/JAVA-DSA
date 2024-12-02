package com.om.interfaces.nested;

public class A {
    // nested interface
    // the nested Interface can be declared as public private or protected,
    // but the top level has to be declared as public or default one.
    public interface nestedInterface {
        boolean idOdd(int num);
    }
}

class B implements A.nestedInterface {
    @Override
    public boolean idOdd(int num) {
        return (num & 1) == 1;
    }
}

