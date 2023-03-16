import java.util.HashMap;
import java.util.Stack;

public class LC_895_Maximum_Frequency_Stack {
    HashMap<Integer, Integer> freq = new HashMap<>();
    HashMap<Integer, Stack<Integer>> st = new HashMap<>();
    int maxFreq = 0;
    public FreqStack() {
        
    }
    
    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);
        maxFreq = Math.max(maxFreq, f);
        if(!st.containsKey(f)) {
            st.put(f, new Stack<Integer>());
        }
        st.get(f).add(val);
    }
    
    public int pop() {
        int x = st.get(maxFreq).pop();
        freq.put(x, maxFreq - 1);
        if(st.get(maxFreq).size() == 0){
            maxFreq--;
        }
        return x;
    }
}
