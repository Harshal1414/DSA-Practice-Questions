import java.util.Stack;

public class LC_1047_Remove_All_Adjacent_Duplicates_In_String {
    public String removeDuplicates(String s){
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!st.isEmpty()){
                if(st.peek() == s.charAt(i)){
                    st.pop();
                }
                else{
                    st.add(s.charAt(i));
                }
            }
            else{
                st.add(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
