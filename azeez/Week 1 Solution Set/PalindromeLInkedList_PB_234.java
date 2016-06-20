/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtremehackerprep.linearDS;

import java.util.Stack;

/**
 *
 * @author azeez
 * @link https://leetcode.com/problems/palindrome-linked-list/
 */
public class PalindromeLInkedList_PB_234 {

    Stack<ListNode> stack = new Stack<>();

    public boolean isPalindrome(ListNode head) {
        boolean result = true;;
        for (ListNode start = head; start != null; start = start.next) {
            stack.push(start);
        }
        for (ListNode start = head; start != null; start = start.next) {
            if (stack.pop().val != start.val) {
                result = false;
                return result;
            }
        }
        return result;
    }
}
