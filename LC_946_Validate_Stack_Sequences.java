import java.util.Stack;

public class LC_946_Validate_Stack_Sequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int i : pushed){
            st.push(i);
            while(!st.isEmpty() && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}
