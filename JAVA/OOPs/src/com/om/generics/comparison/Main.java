package com.om.generics.comparison;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student david = new Student(37, 98.67f);
        Student danial = new Student(5, 87.32f);
        Student hitesh = new Student(36, 46.90f);
        Student brandan = new Student(10, 77.32f);
        Student jon = new Student(35, 67.32f);

        Student[] list = {david, danial, hitesh, brandan, jon};

        System.out.println(Arrays.toString((list)));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });

        // lambda expressions

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

        if(david.compareTo(danial) > 0) {
            System.out.println("Nilam has More marks");
        }
    }
}