import java.util.Stack;

public class LC_1209_Remove_All_Adjacent_Duplicates_in_String_II {
    public String removeDuplicates(String s, int k){
        Stack<Character> charSt = new Stack<>();
        Stack<Integer> countSt = new Stack<>();
        for(char i : s.toCharArray()){
            if(!charSt.isEmpty() && charSt.peek() == i) countSt.push(countSt.peek() + 1);
            else countSt.push(1);
            charSt.push(i);

            if(countSt.peek() == k){
                for(int j = 0; j < k; j++){
                    charSt.pop();
                    countSt.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!charSt.isEmpty()){
            sb.append(charSt.pop());
        }
        
        return sb.reverse().toString();
    }
}
