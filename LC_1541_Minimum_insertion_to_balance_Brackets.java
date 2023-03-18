public class LC_1541_Minimum_insertion_to_balance_Brackets {
    public int minInsertions(String s){
        int invalidCount = 0, stack = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stack++;
            }
            else{
                if(i+1 == s.length() || s.charAt(i + 1) != ')'){
                    invalidCount++;
                }
                else{
                    i++;
                }
                if(stack == 0){
                    invalidCount++;
                }
                else{
                    stack--;
                }
            }
        }
        return invalidCount + 2 * stack;
    }
}
