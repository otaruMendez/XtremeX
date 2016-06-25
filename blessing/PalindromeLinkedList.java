public class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if (head != null) {
            ListNode reverse = new ListNode(head.val);

            ListNode mainPointer = head.next, temp;

            //reverse the List
            while (mainPointer != null) {
                temp = new ListNode(mainPointer.val);
                temp.next = reverse;
                reverse = temp;
                mainPointer = mainPointer.next;
            }


            //begin to compare the nodes
            mainPointer = head;
          while (mainPointer != null) {
                if (mainPointer.val != reverse.val)
                    return false;
                mainPointer = mainPointer.next;
                reverse = reverse.next;
            }
        }
        return true;
    }
}
