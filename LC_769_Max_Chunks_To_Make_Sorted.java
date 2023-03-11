import java.util.Stack;

public class LC_769_Max_Chunks_To_Make_Sorted{
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int x : arr){
            if(st.isEmpty() || st.peek() < x){
                st.push(x);
            }
            else{
                int max = x;
                while(!st.isEmpty() && st.peek() > x){
                    max = Math.max(max, st.pop());
                }
                st.push(max);
            }
        }
        return st.size();
    }
}