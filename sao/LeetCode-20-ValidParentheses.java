/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author saopayne
 */
public class ValidParentheses {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine().trim();
        ValidParentheses theses = new ValidParentheses();
        System.out.println(theses.isValid(inputStr));
    }
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
            String oper = "({[";
            String oper2 = ")}]";
            for (int i = 0; i < s.length(); i++) {
                if (oper.contains(s.substring(i, i + 1))) {
                    int index = oper.indexOf(s.substring(i, i + 1));
                    stack.push(oper2.charAt(index));
                } 
                else if (stack.isEmpty())
                    return false;
                else {
                    char myChar = stack.pop();
                    if (myChar != s.charAt(i))
                        return false;
                    }
            }
            if (!stack.empty())
                    return false;
            return true;
    }
}
