import java.util.ArrayList;
import java.util.List;

public class LC_Find_And_Replace_Pattern {
    public List<String> findAndReplacePattern(String[] words, String pattern){
        List<String> res = new ArrayList<>();
        for(String str : words){
            if(check(str, pattern)){
                res.add(str);
            }
        }
        return res;
        
    }
    boolean check(String a , String b){
        for(int i =0; i<a.length(); i++){
            if(a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))){
                return false;
            }
        }
        return true;
    }
}

/*
 * By using indexOf() you get a unique pattern that could be matched with any other string.
For example, for pattern: "abbccda" you would get an 'index pattern' of "0113350" since the first occurrence of 'a' happens at index 0, the first occurrence of 'b' is index 1, 'c' at index 3, and etc.
However if the string being passed in does not match the pattern such as "abbbccd" this would give an 'index pattern' of "0111446". For the first index that is not the same as the pattern, you return false. So in this case you would return false at index 3 since 1 is not equal to 3.
But by having a matching string such as "bccddeb" this would give you the pattern "0113350" which matches and returns true.
 */
