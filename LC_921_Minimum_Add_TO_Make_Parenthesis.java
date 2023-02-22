import java.util.*;

public class LC_921_Minimum_Add_TO_Make_Parenthesis {
    public int minAddToMakeValid(String s) {
        int moves = 0;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    moves++;
                }
                else{
                    st.pop();
                }
            }
        }
        return moves + st.size();
    }
}