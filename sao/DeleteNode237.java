/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One;

/**
 *
 * @author saopayne
 */
public class DeleteNode237 {
    
 
    void deleteNode(ListNode node) {
        ListNode prev = null;
        if(node.next != null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
        
    }
 
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
