import java.util.*;

public class LC_41_First_Missing_Positive {
    public int firstMissingPositive(int[] nums){
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == ans){
                ans++;
            }
        }
        return ans;
    }
}
