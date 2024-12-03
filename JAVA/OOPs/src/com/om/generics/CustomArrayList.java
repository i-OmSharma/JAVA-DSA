package com.om.generics;

import java.util.ArrayList;

// Working of ArrayList
// when the size exceeds, the arraylist make a new arraylist of size double of the existing one,
// and then puts the old values in the newer one and continues data adding in it.
// it grows exponentially
// its taking constant time on an average (Amortized constant time).

public class CustomArrayList {
    public static void main(String[] args) {

        private int[] data;
        private int DEFAULT_SIZE = 10;
        private int size = 0;

        public CustomArrayList() {
            this.data = new int[DEFAULT_SIZE];
        }

        public void add (int num) {
            if (isFull()) {
                resize();
            }
        }


        ArrayList list = new ArrayList();
    }
}
