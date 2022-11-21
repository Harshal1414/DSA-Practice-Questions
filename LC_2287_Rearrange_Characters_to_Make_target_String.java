import java.util.HashMap;

public class LC_2287_Rearrange_Characters_to_Make_target_String {
    public int rearrangeCharacters(String s, String t){
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> map2 =new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0) + 1);
        }
        int ans = Integer.MAX_VALUE;

        for(Character i : map2.keySet()){
            if(map1.containsKey(i)){
                ans = Math.min(map1.get(i) / map2.get(i), ans);
            }
        }
        
        return ans;
    }
}
