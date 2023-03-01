import java.util.HashSet;
import java.util.Stack;

public class LC_1249_Minimum_Remove_to_Make_Valid_Parentheses{
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)){
                continue;
            }
            if(ch == '('){
                st.push(i);
            }
            else{
                if(!st.isEmpty() && s.charAt(st.peek()) == '('){
                    st.pop();
                }
                else{
                    st.push(i);
                }
            }
        }

        StringBuilder res = new StringBuilder();
        HashSet<Integer> set = new HashSet<>(st);
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(i)){
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}