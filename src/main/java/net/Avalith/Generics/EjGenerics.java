package net.Avalith.Generics;

public class EjGenerics {
    public static void main(String[] args) {
        Stack<Integer> smalStack = new Stack<>();

        smalStack.push(4);
        smalStack.push(7);
        smalStack.push(5);
        smalStack.push(8);
        smalStack.push(1);
        smalStack.push(9);
        smalStack.push(6);

        System.out.println(smalStack.toString());

        System.out.println("Top element: "+smalStack.top());
        smalStack.pop();
        System.out.println("Top element: "+smalStack.top());
    }
}
