import java.util.Stack;

public class LC_1963_Minimum_Number_of_Swaps_to_Make_The_String_Balanced {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0; 
        for(char ch : s.toCharArray()){
            if(ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty() == false && st.peek() == ']'){
                    st.pop();
                }
                else{
                    count++;
                }
                st.push(ch);
            }
        }
        return (count + 1) / 2;
    }
}
