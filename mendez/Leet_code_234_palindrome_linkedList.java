/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
   
    boolean isPalindrome(ListNode head) {
        Stack<Integer> nodes = new Stack();
        ListNode currentNode = head;
        while(currentNode != null){
            nodes.push(currentNode.val);
            currentNode = currentNode.next;
        }
        currentNode = head;
        while(currentNode != null){
           if(currentNode.val != nodes.pop()){
               return false;
           }
           currentNode = currentNode.next;
        }
        return true;
    }
}
