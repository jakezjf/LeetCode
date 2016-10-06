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
