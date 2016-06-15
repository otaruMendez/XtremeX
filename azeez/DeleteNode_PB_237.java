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
 * @linkToProblem https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNode_PB_237 {

    public void deleteNode(ListNode node) {

        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
