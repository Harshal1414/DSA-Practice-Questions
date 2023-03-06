import java.util.Stack;

public class LC_503_Next_Greater_Element_II {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        for(int i = n-1; i >= 0; i--){
            st.push(nums[i]);
        }
        int [] nextGreater = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            nextGreater[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return nextGreater;
    }
}
