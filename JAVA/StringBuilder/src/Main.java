public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int num = 10;
        String name = "Om";
        System.out.println(name);

        String a = "Om";
        System.out.println(a);
        a = "kunal";
        System.out.println(a);

    }
}

//string Pool:- separate memory structure inside the Heap memory
//use case: all the similar values of strings are not like recreated in the pool.
//all reference variable will point to the same reference variable.
//if one reference variable change the object value then it will not be changed for the other one.
//reason: Immutability,Strings are immutable in java.We can't change the object.
//if u want to change the object create a new object.