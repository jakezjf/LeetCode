/**
*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
*
*push(x) -- Push element x onto stack.
*pop() -- Removes the element on top of the stack.
*top() -- Get the top element.
*getMin() -- Retrieve the minimum element in the stack.
*Example:
*MinStack minStack = new MinStack();
*minStack.push(-2);
*minStack.push(0);
*minStack.push(-3);
*minStack.getMin();   --> Returns -3.
*minStack.pop();
*minStack.top();      --> Returns 0.
*minStack.getMin();   --> Returns -2.
*/

public class MinStack {
    private Stack<Integer> stackData;

    private Stack<Integer> stackMin;

    /** initialize your data structure here. */
    public MinStack() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int x) {
        if (this.stackMin.isEmpty()){
            this.stackMin.push(x);
        }
        else if(x <= this.getMin()){
            this.stackMin.push(x);
        }
        this.stackData.push(x);
    }

    public void pop() {
        if(this.stackData.isEmpty()){
            return;
        }else{
            int value = this.stackData.peek();
            if(value == this.getMin()){
                this.stackMin.pop();
            }
        }
        this.stackData.pop();
    }

    public int top() {
        if (this.stackData.isEmpty()){
            return 0;
        }
        return this.stackData.peek();
    }

    public int getMin() {
        if(this.stackMin.isEmpty()){
            return 0;
        }
        return this.stackMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

// public class MinStack {
//     private Stack<Integer> stackData;

//     private Stack<Integer> stackMin;

//     /** initialize your data structure here. */
//     public MinStack() {
//         this.stackData = new Stack<Integer>();
//         this.stackMin = new Stack<Integer>();
//     }

//     public void push(int x) {
//        if(this.stackMin.isEmpty()){
//             this.stackMin.push(x);
//         }
//         else if(x < this.getMin()){
//             this.stackMin.push(x);
//         }else{
//             this.stackMin.push(this.getMin());
//         }
//         this.stackData.push(x);
//     }

//     public void pop() {
//         if(this.stackData.isEmpty()){
//             return;
//         }
//         this.stackMin.pop();
//         this.stackData.pop();
//     }

//     public int top() {
//         if(this.stackData.isEmpty()){
//             return 0;
//         }
//         return this.stackData.peek();
//     }

//     public int getMin() {
//         if(this.stackMin.isEmpty()){
//             return 0;
//         }
//         return this.stackMin.peek();
//     }
// }
