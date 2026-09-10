class MyStack {
Queue<Integer> Q1;
Queue<Integer> Q2;
    public MyStack() {
        Q1=new ArrayDeque<>();
        Q2=new ArrayDeque<>();
    }
    
    public void push(int x) {
        Q1.offer(x);
    }
    
    public int pop() {
        if(Q1.isEmpty()){
            return -1;
        }
        while(Q1.size()>1){
            Q2.offer(Q1.poll());
        }
        int value=Q1.poll();
        while(!Q2.isEmpty()){
            Q1.offer(Q2.poll());
        }
        return value;
    }
    
    public int top() {
        if(Q1.isEmpty()){
            return -1;
        }
        while(Q1.size()>1){
            Q2.offer(Q1.poll());
        }
        int value= Q1.peek();
        Q2.offer(Q1.poll());
        while(!Q2.isEmpty()){
            Q1.offer(Q2.poll());
        }
        return value;
    }
    
    public boolean empty() {
        return Q1.isEmpty()&& Q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */