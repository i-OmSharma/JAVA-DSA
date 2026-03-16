public class Main {
    public static void main(String[] args) throws StackException{
        System.out.println("Hello world!");

        CustomStack stack = new CustomStack(5);

        System.out.println(stack.push(32));
        stack.push(2);
        stack.push(6);
        stack.push(21);


        System.out.println(stack.pop());

    }
}