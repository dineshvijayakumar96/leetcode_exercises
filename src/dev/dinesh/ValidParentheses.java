package dev.dinesh;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String s = "(}";

        Stack<Character> stack = new Stack<>();

        boolean output = true;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                output = false;
            }
        }

        System.out.println("isValid: " + output);
    }
}
