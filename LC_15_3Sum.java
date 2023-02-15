import java.util.*;
public class LC_15_3Sum {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        if(nums.length == 0) return new ArrayList<>(res);
        for(int i = 0; i < nums.length-2; i++){
            int j = i + 1, k = nums.length - 1;
            while (j < k){
                int sum = nums[j] + nums[k];
                if(sum == -nums[i]){
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }
                else if(sum < -nums[i]){
                    j++;
                }
                else if(sum > -nums[i]){
                    k--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
