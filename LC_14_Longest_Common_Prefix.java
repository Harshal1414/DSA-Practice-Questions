import java.util.*;
public class LC_14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        
        Arrays.sort(strs);
        
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for(int i = 0; i < first.length; i++){
            if(first[i] != last[i]){
                break;
            }
            result.append(first[i]);
        }

        return result.toString();
    }
}
