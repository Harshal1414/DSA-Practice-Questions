import java.util.*;
import java.lang.*;

public class LC_Minimum_Absolute_Difference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            int diff = arr[i+1] - arr[i];
            if(diff < min){
                min = diff;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i+1]));
            }
            else if(diff==min){
                res.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return res;
    }
}
