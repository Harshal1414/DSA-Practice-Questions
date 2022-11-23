import java.util.*;

public class LC_136_Single_Number {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault((nums[i]), 0) + 1);
        }
        int ans = 0;
        for(int i : nums){
            if(map.get(i) == 1){
                ans = i;
            }
        }
        return ans;
    }
}
