//Min stack 2.155
class MinStack {
    
    Stack<Integer> elements=new Stack<Integer>();
    Stack<Integer> mins=new Stack<Integer>();
    
    public void push(int x) {    
     if(elements.empty() || mins.peek().intValue()>=x)
      mins.push(x);
     elements.push(x);
    }

    public void pop() {
      int x=elements.pop();
       if(x==mins.peek())
        mins.pop();
    }

    public int top() {
       return elements.peek().intValue();
    }

    public int getMin() {
      return mins.peek().intValue();
    }
}