import java.security.KeyStore.Entry;
import java.util.*;

public class LC_599_Minimu_Index_Sum_of_Two_Lists {
    public String[] findRestaurant(String[] list1, String[] list2){
        Map<String, Integer> map = new HashMap<>();
        int sum = 0, prev = Integer.MAX_VALUE;
        String res = null;

        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                sum = i + map.get(list2[i]);
                if(prev > sum){
                    prev = sum;
                    res = list2[i];
                }
                else if(prev == sum){
                    prev = sum;
                    res += "  " +list2[i];
                }
            }
        }
        return res.split("  ");
    }
}
