public class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode reversedListHead = null;
       while(head != null){
          ListNode next = head.next;
          head.next = reversedListHead;
          reversedListHead = head;
          head = next;
       }
       return reversedListHead;
    }
}
