import java.util.HashSet;
import java.util.Set;

class LC_3_Longest_Substring_Without_Repeating_Characters{
    public int lengthOfLongestSubstring(String s){

        int left = 0, right = 0, max = 0;
        Set<Character> seen = new HashSet<>();
        while (right < s.length()){
            char c = s.charAt(right);
            if(seen.add(c)){
                max = Math.max(max, right - left + 1);
                right++;
            }
            else{
                while(s.charAt(left) != c){
                    seen.remove(s.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++;
            }
        }
        return max;
    }
}