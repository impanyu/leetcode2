//2.225  Implement Stack using Queues
class MyStack {
    private Queue<Integer> q1=new LinkedList<>();
    private Queue<Integer> q2=new LinkedList<>();
    // Push element x onto stack.
    public void push(int x) {
        q1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        Integer top;
            while(!q1.isEmpty()){
                top=q1.poll();
                if(q1.isEmpty())
                  break;
                q2.add(top);
            }
           while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
    }

    // Get the top element.
    public int top() {
         Integer top=null;
            while(!q1.isEmpty()){
                top=q1.poll();
                q2.add(top);
            }
           while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
            return top==null?0:top.intValue();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}