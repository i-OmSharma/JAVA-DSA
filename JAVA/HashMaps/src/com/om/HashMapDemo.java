package com.om;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Om", 22);
        map.put("Kunal", 24);
        map.put("harkirat", 27);

        System.out.println(map.get("Kunal"));
    }
}
