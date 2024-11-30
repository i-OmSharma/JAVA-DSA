package com.om.abstractDemo;

public class Main {
    public static void main(String[] args) {
        parent Son = new son(21);

        Son.career("IAS");
        Son.partner("Alice", 25);

        parent.hello();

        Son.normal();

    }
}
