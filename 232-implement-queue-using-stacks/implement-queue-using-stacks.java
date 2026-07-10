class MyQueue {
    private Stack<Integer>stack;
 

    public MyQueue() {
        stack=new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if(!empty()){
           Collections.reverse(stack);
           int curr=stack.pop();

           Collections.reverse(stack);

           return curr; 
        }
        return -1;
    }
    
    public int peek() {
        Collections.reverse(stack);
        int curr=stack.peek();
          Collections.reverse(stack);
          return curr;
    }
    
    public boolean empty() {
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */