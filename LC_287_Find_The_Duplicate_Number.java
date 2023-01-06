import java.util.*;
public class LC_287_Find_The_Duplicate_Number {
    public int findDuplicate(int[] nums){
        Arrays.sort(nums);
        int start = 0, end = nums.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid] >= mid+1){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return nums[start];
    }
}
