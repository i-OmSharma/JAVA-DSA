package com.om.generics;

import java.util.ArrayList;
import java.util.Arrays;

// Working of ArrayList
// when the size exceeds, the arraylist make a new arraylist of size double of the existing one,
// and then puts the old values in the newer one and continues data adding in it.
// it grows exponentially
// its taking constant time on an average (Amortized constant time).

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add (int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp =  new int[data.length * 2];

        //copy the current item into the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        for(int i = 0; i < 14; i++){
            list.add(2 * i);
        }

        System.out.println(list);
    }
}