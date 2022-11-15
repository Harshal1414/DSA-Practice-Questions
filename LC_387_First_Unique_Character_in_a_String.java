import java.util.*;

public class LC_387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s){
        Map<Character, Integer> set = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            set.put(c, set.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i<s.length(); i++){
            if(set.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
