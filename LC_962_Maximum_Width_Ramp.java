import java.util.Stack;

public class LC_962_Maximum_Width_Ramp {
    public int maxWidthRamp(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(stack.isEmpty() || nums[i] < nums[stack.peek()]){
                stack.push(i);
            }
        }
        for(int i = nums.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && nums[i] >= nums[stack.peek()]){
                res = Math.max(res, i - stack.pop());
            }
        }
        return res;
    }
}
