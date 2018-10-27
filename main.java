package com.company;

public class main {
    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(23);
        stack.display();
        stack.push(12);
        stack.display();
        stack.push(4);
        stack.display();
        stack.pop();
        stack.display();
    }
}
