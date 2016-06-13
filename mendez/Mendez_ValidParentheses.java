/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XtremeX;
import java.util.Stack;

/**
 * @author tunde
 */
public class Mendez_ValidParentheses {

    public static char getClosingParenthesis(char c) {
        switch (c) {
            case '{':
                return '}';
            case '[':
                return ']';
            case '(':
                return ')';
            default:
                return 'c'; // c - means the character is not an opening paranthesis.
        }
    }

    public static void main(String[] args) {
        String testCase = "{}}";
        Stack<Character> stack = new Stack<>();
        char[] testArary = testCase.toCharArray();
        for (char parenthesis : testArary) {
            if (getClosingParenthesis(parenthesis) != 'c') {
                stack.push(parenthesis);
            } else {
                if (stack.size() == 0) {
                    System.out.println("false");
                    System.exit(0);
                }
                if (parenthesis != getClosingParenthesis(stack.pop())) {
                    System.out.println("false");
                    System.exit(0);
                }
            }
        }
        if (stack.size() == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

