package om;

public class NumberRecursion {
    public static void main(String[] args) {
        print(1);
    }


    static void print(int n) {

        //Base Case: condition to break (return)
        if (n == 5) {
            System.out.println(n);
            return;
        }

        // Work: do what u want
        System.out.println(n);

        // Recursive Call: number of times to call the function
        print(n + 1);
    }






    //Basic Function calling
//    static void print(int n){
//        System.out.println(n);
//        print2(2);
//    }
//    static void print2(int n){
//        System.out.println(n);
//        print3(3);
//    }
//    static void print3(int n){
//        System.out.println(n);
//        print4(4);
//    }
//    static void print4(int n){
//        System.out.println(n);
//        print5(5);
//    }
//    static void print5(int n){
//        System.out.println(n);
//
//    }


}
