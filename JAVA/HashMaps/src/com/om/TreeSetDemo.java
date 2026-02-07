package com.om;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(21);
        set.add(33);
        set.add(52);
        set.add(91);
        set.add(87);
        set.add(65);

        System.out.println(set);
    }
}
