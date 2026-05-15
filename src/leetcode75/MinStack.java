package leetcode75;

import java.util.Stack;

class minStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public minStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {

        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        minStack obj = new minStack();

        obj.push(5);
        obj.push(3);
        obj.push(7);

        System.out.println(obj.getMin()); // 3

    }
}