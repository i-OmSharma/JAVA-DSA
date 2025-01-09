package com.om.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        list2.add(1);
        list2.add(2);
        list2.add(3);

        List<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(23);
        vector.add(31);

        System.out.println(vector);


    }
}
