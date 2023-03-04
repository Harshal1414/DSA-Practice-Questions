public class LC_2444_Count_Subarrays_With_Fixed_Bounds {
    public long countSubarrays(int[] nums, int minK, int maxK){
        int n = nums.length;
        int leftBound = -1, lastMin = -1, lastMax = -1;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] >= minK && nums[i] <= maxK){
                if(nums[i] == minK){
                    lastMin = i;
                }
                if(nums[i] == maxK){
                    lastMax = i;
                }
                count += Math.max(0, Math.min(lastMin, lastMax) - leftBound);
            }
            else{
                leftBound = i;
                lastMin = -1;
                lastMax = -1;
            }
        }
        return count;
    }
}
