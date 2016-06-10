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

    public static char getClosingTag(char c) {
        switch (c) {
            case '{':
                return '}';
            case '[':
                return ']';
            case '(':
                return ')';
            default:
                return 'c';
        }
    }

    public static void main(String[] args) {
        String testCase = "[{{}}]";
        if (getClosingTag(testCase.charAt(0)) == 'c') {
            System.out.println("false");
            System.exit(0);
        }
        Stack<Character> stack = new Stack<>();
        char[] testArary = testCase.toCharArray();
        for (char c : testArary) {
            if (getClosingTag(c) != 'c') {
                stack.push(c);
            } else {
                if (stack.size() == 0) {
                    System.out.println("false");
                    System.exit(0);
                }
                if (c != getClosingTag(stack.pop())) {
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
