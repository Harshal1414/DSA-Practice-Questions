import java.util.Stack;

public class LC_1673_Find_the_Most_Competitive_Subsequence {
    public int[] mostCompetitive(int[] nums, int k){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[k];
        for(int i = 0; i < nums.length; i++){
            while(!stack.isEmpty() && nums[i] < nums[stack.peek()] && (nums.length - i) + stack.size() > k){
                stack.pop();
            }
            if(stack.size() < k){
                stack.push(i);
            }
        }
        for(int i = k -1; i >= 0; i--){
            res[i] = nums[stack.pop()];
        }
        return res;
    }
}
