import java.util.*;
public class LC_2375_Construct_Smalllest_Number_From_DI_String {
    public String smallestNumber(String pattern) {
        StringBuilder ans = new StringBuilder("");
        int num = 1;
        Stack<Integer> st = new Stack<>();
        st.push(1);
        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(ch == 'I'){
                while(st.size() != 0){
                    ans.append(st.pop());
                }
                num++;
                st.push(num);
            }
            else{
                num++;
                st.push(num);
            }
        }
        while(st.size()!=0){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}
