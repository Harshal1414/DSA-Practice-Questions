import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC_Sort_the_People {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        
        for(int i = 0; i<names.length; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String [] res = new String[names.length];
        int index = 0;
        for(int i = heights.length - 1; i>=0; i--){
            res[index] = map.get(heights[i]);
            index++;
        }
        return res;
    }
}
