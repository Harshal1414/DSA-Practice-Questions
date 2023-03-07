import java.util.Stack;

public class LC_1944_Number_of_Visible_People_in_a_Queue {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length, res [] = new int [n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; ++i){
            while(!st.isEmpty() && heights[st.peek()] <= heights[i]){
                res[st.pop()]++;
            }
            if(!st.isEmpty()){
                res[st.peek()]++;
            }
            st.add(i);
        }
        return res;
    }
}
