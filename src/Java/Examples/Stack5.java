package Java.Examples;

// Stack (Legacy, extends Vector)
// Implements LIFO (Last-In-First-Out).
// Methods: push(), pop(), peek().
// Modern alternative: use ArrayDeque for stack.

import java.util.Stack;

public class Stack5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        System.out.println(stack.pop());  //
        System.out.println(stack.peek()); //
        System.out.println(stack);
    }
}
