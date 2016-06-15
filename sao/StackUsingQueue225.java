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
public class StackUsingQueue225 {
    
    LinkedList<Integer> queue = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        while (size > 1) {
            queue.add(queue.remove());
            size--;
        }
    }
 
    // Removes the element on top of the stack.
    public void pop() {
        queue.remove();
    }
 
    // Get the top element.
    public int top() {
        return queue.peek();
    }
 
    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
