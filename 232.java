//2.232 Implement Queue using Stack
class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> temp=new Stack<>();
    Integer front;
    public void push(int x) {
        if(stack.empty()) front=new Integer(x);
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!stack.empty())
            temp.push(stack.pop());
        temp.pop();
        if(temp.empty()) front=null;
        else  front=temp.peek();
        while(!temp.empty())
            stack.push(temp.pop());
        
    }

    // Get the front element.
    public int peek() {
        if(front==null) return 0;
        return front.intValue();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.empty();
    }
}