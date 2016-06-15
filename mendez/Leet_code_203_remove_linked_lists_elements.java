public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode currentHead = head;
        
        if(currentHead == null){
            return currentHead;
        }
        
        while(currentHead.val == val){
            currentHead = currentHead.next;
            if(currentHead == null){
                return currentHead;
            }
        }
        
        ListNode previousNode = currentHead;
        ListNode currentNode = currentHead.next;
        while(currentNode != null){
            ListNode nextNode = currentNode.next;
            if(currentNode.val == val){
                previousNode.next = nextNode;
                currentNode = nextNode;
            }else{
            previousNode = currentNode;
            currentNode = currentNode.next;
            }
         }
        return currentHead;
}
