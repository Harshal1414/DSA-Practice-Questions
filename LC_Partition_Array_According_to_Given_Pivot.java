import java.util.*;

public class LC_Partition_Array_According_to_Given_Pivot {
    public int[] pivotArray(int[] nums, int pivot){
        int res[] = new int[nums.length];
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < pivot){
                res[j++] = nums[i++];
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == pivot){
                res[j++] = nums[i++];
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > pivot){
                res[j++] = nums[i++];
            }
        }
        
        return res;
    }
}
