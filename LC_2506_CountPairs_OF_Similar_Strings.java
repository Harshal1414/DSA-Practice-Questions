import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LC_2506_CountPairs_OF_Similar_Strings {
    public int similarPairs(String[] words){
        int count = 0;
        for(int i = 0; i < words.length - 1; i++){
            for(int j = i + 1; j < words.length; j++){
                count += check(words[i], words[j]);
            }
        }
        return count;
    }
    private int check(String s, String t){
        HashSet <Character> set1 = new HashSet<>(); //a,b
        HashSet <Character> set2 = new HashSet<>(); //a,b
        for(char c : s.toCharArray()){
            set1.add(c);
        }
        for(char c : t.toCharArray()){
            set2.add(c);
        }
        boolean value = set1.equals(set2);
        return value ? 1 : 0;
    }
}