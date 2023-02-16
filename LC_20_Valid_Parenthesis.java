import java.util.*;

public class LC_20_Valid_Parenthesis {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
                continue;
            }
            if(st.size() == 0 || map.get(s.charAt(i)) != st.pop()){
                return false;
            }
        }
        if(st.size() == 0){
            return true;
        }
        return false;
    }
}
