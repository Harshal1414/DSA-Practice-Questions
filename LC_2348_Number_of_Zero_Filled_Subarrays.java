public class LC_2348_Number_of_Zero_Filled_Subarrays{
    public long zeroFilledSubarray(int[] nums){
        long ans = 0;
        int n = nums.length;
        long count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                count++;
            }
            else{
                ans += (count * (count + 1) / 2);
                count = 0;
            }
        }
        if(count != 0){
            ans += (count * (count + 1) / 2);
        }
        return ans;
    }
}