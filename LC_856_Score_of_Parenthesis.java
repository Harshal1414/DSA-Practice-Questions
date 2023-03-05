import java.util.Stack;

public class LC_856_Score_of_Parenthesis {
    public int scoreOfParentheses(String s){
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(res);
                res = 0;
            }
            else{
                res = st.pop() + Math.max(res * 2, 1);
            }
        }
        return res;
    }
}
