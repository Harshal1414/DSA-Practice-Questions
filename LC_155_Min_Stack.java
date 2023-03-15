import java.util.Stack;

public class LC_155_Min_Stack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public MinStack(){

    }
    public void push(int val){
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        st.push(val);
    }
    public void pop(){
        if(st.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        st.pop();
    }
    public int top(){
        return st.peek();
    }
    public int getMin(){
        return minStack.peek();
    }

}
