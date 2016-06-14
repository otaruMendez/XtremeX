/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One;

import java.util.Stack;

/**
 *
 * @author saopayne
 */
public class PalindromeLinkedList234 {
           
   boolean isPalindrome(ListNode head) {
        Stack<Integer> values = new Stack<>();
        ListNode run = head;
        while(run != null){
            values.push(run.val);
            run = run.next;
        }
        run = head;
        while(run != null){
            int valueInStack = values.pop();
            if (valueInStack != run.val){
                return false;
            }
            run = run.next;
        }
     
    return true;
    } 
    
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
}
