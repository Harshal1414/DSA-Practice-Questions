import java.util.ArrayList;
import java.util.*;

public class LC_448_Find_All_Numbers_Disappered_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            if(nums[i+1] > nums[i]){
                large = nums[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(!(set.contains(i))){
                list.add(i);
            }
        }
        return list;
    }
}
