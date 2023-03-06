import java.util.Stack;

public class LC_1653_Minimum_Deletions_to_Make_String_Balanced {
    public int minimumDeletions(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int res = 0;
        for(int i = n - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(!st.isEmpty() && st.peek() < c){
                res++;
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        return res;
    }
}
