import java.util.Stack;

class MyQueue {
    
    Stack<Integer> stack = new Stack<>();

    public Stack<Integer> reverseStack(Stack<Integer> stack1){
        Stack<Integer> stack = new Stack<>();
        while(!stack1.empty()){
            stack.push(stack1.pop());
        }
        return stack;
    }

    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        stack = reverseStack(stack);
        stack.pop();
        stack = reverseStack(stack);
    }

    // Get the front element.
    public int peek() {
        stack = reverseStack(stack);
        int peekValue =  stack.peek();
        stack = reverseStack(stack);
        return peekValue;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if(stack.empty()){
            return true;
        }
        return false;
    }
}
