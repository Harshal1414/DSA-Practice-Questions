import java.util.*;
import java.lang.*;

public class LC_Sum_of_Unique_Elements {
    public int sumOfUnique(int[] nums){
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int ele : nums){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }
            else{
                map.put(ele, 1);
            }
        }
        for(int num : map.keySet()){
            if(map.get(num)==1){
                sum += num;
            }
        }
        return sum;
    }
}
