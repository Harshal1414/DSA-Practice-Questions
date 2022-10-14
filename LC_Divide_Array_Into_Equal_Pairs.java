import java.util.*;

public class LC_Divide_Array_Into_Equal_Pairs{
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i+=2){
            if(nums[i] != nums[i+1]){
                return false;
            }

        }
        return true;
    }
}