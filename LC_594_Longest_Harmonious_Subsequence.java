import java.util.HashMap;
import java.util.Map;

public class LC_594_Longest_Harmonious_Subsequence {
    public int findLHS(int[] nums){
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : map.keySet()){
            if(map.containsKey(i+1)){
                result = Math.max(result, map.get(i) + map.get(i+1));
            }
        }
        return result;
    }
}
