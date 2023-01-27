import java.util.HashMap;

public class LC_2053_Kth_Distinct_String_in_an_Array {
    public String kthDistinct(String[] arr, int k){
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : arr){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        int count = 1;
        for(String s : arr){
            if(map.get(s)==1 && count++ == k){
                return s;
            }
        }
        return "";
    }
}
