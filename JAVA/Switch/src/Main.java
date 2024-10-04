import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//== -it checks both reference and value //(.equals)-only checks the value not references

//        if (fruit.equals("Mango")){
//            System.out.println("king of fruits");
//        }
//        if (fruit.equals("Apple")){
//            System.out.println("red fruit");
//        }

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("red fruit");
            case "Watermellon" -> System.out.println("Big fruit");
            case "cherry" -> System.out.println("Small berry");
            default -> System.out.println("Enter a valif fruit");
        }
    }
}