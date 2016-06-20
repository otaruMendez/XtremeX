/**
@LinkToQuestion: https://leetcode.com/problems/reverse-linked-list/
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Reverse_linked_list206 {
    public ListNode reverseList(ListNode head) {
        
        if(head == null)
            return head;
        ListNode remainder = head.next;
        head.next = null;
        
        //walk through the remaining list item
        ListNode temp;
        while(remainder != null){
            temp = remainder;
            remainder = remainder.next;
            temp.next = head;
            head = temp;
        }
        
        return head;
        
    }
}
