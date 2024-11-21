package com.om.access;

public class ObjectDemo {

    int num;

    // Already disused
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {

    }
//-------------------------------------------------------------------------------------------//
    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {  //gives number representation of an object
        return super.hashCode(); //random number using algorithm
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



    public ObjectDemo() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(12);
        System.out.println(obj.hashCode());
    }
}
