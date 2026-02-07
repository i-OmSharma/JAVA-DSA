package com.om;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(21);
        set.add(33);
        set.add(52);
        set.add(91);
        set.add(87);
        set.add(65);

        System.out.println(set);
    }
}
