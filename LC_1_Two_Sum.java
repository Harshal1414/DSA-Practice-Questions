import java.util.HashMap;

public class LC_1_Two_Sum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        // Adding values in a HashMap
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        // Searching in a HashMap
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int remaining = target - num;
            if(map.containsKey(remaining)){
                int index = map.get(remaining);
                if(index == i){
                    continue;
                }
                return new int[]{i, index};
            }
        }
        return new int[]{}; 
    }
}
