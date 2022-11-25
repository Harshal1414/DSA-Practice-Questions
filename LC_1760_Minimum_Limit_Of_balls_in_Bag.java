public class LC_1760_Minimum_Limit_Of_balls_in_Bag{
    public int minimumSize(int[] nums, int maxOperations){
        
        int max = 0;
        for(int i : nums){
            max = Math.max(i, max);
        }
        int start = 0, end = max, count = 0;
        while(start<end){
            int mid = start + ((end - start)/2);
            for(int ele : nums){
                count += (ele-1) / mid;
            }
            if(count > maxOperations){
                start = mid - 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}