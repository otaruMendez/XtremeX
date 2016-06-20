/**
 * @QuestionUrl: https://leetcode.com/problems/remove-linked-list-elements/
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Remove_linked_list_elements203 {
    public ListNode removeElements(ListNode head, int val) {
            
       /*Remove all the occurence of the val at the head*/
       while(head != null && head.val == val)
            head = head.next;
            
        if(head == null)
            return head;
        //get a pointer to walk through the list
        ListNode p = head;
        while(p.next != null){
            if(p.next.val == val){
                p.next = p.next.next;
                continue;
            }
            p = p.next;
        }
        return head;
    }
}
