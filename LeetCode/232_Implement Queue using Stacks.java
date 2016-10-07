/**
*Implement the following operations of a queue using stacks.
*
*push(x) -- Push element x to the back of queue.
*pop() -- Removes the element from in front of queue.
*peek() -- Get the front element.
*empty() -- Return whether the queue is empty.
*Notes:
*You must use only standard operations of a stack -- which means only push to top, peek/pop from top, 
*size, and is empty operations are valid.
*Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue),
*as long as you use only standard operations of a stack.
*/

class MyQueue {
    
    Stack<Integer> stack1 = new Stack<Integer>();
    
    Stack<Integer> stack2= new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        this.stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!this.stack1.isEmpty()){
            this.stack2.push(this.stack1.peek());
            this.stack1.pop();
        }
        this.stack2.pop();
        while(!this.stack2.isEmpty()){
            this.stack1.push(this.stack2.peek());
            this.stack2.pop();
        }
    }

    // Get the front element.
    public int peek() {
        while(!this.stack1.isEmpty()){
            this.stack2.push(this.stack1.peek());
            this.stack1.pop();
        }
        int value = this.stack2.peek();
        while(!this.stack2.isEmpty()){
            this.stack1.push(this.stack2.peek());
            this.stack2.pop();
        }
        return value;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if(this.stack1.isEmpty() && this.stack2.isEmpty()){
            return true;
        }
        return false;
    }
}

