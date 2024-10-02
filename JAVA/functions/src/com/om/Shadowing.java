package com.om;

public class Shadowing {

    /*
     * Shadowing-->it's a practice og using 2 variable with the same name within the scope that overlaps
     *Shadowing doesn't take place in methods , it's just for class variable.
     * */
    static int z = 70;//static is object independent thing , so u can't use object dependent things in object independent things
    public static void main(String[] args) {
        System.out.println(z);//70
        int x ;//(declaration)//shadowing begins actually when the local variable is declared.
        //scope of the local variable shadows the class variable .begging at the point where the local scope begins.
//        System.out.println(x);//Scope will begin when value is initialized.
        x=40;//(initialization)
        System.out.println(z);//40
        n();//70

    }
    static void n(){
        System.out.println(z);
    }
}