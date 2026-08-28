class Pair{
    int value;
    int min;
    Pair(int value, int min){
        this.value=value;
        this.min=min;
    }
}
class MinStack {
    Deque<Pair> stack=new ArrayDeque<>();

    public void push(int value) {
        int currmin;
        if(stack.isEmpty()){
            currmin=value;
        }
        else{
            currmin=Math.min(value,stack.peek().min);
        }
        stack.push(new Pair(value,currmin));
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        stack.pop();
        
    }
    
    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek().value;
        
    }
    
    public int getMin() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek().min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */