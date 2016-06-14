/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One;

import java.util.Stack;

/**
 *
 * @author saopayne
 */
public class QueueUsingStack232 {
    
    Stack stack = new Stack();
    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        stack.remove(0);
    }

    // Get the front element.
    public int peek() {
        return (int) stack.get(0);
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
