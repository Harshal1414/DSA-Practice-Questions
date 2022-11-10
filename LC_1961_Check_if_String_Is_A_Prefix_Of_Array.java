public class LC_1961_Check_if_String_Is_A_Prefix_Of_Array {
    public boolean isPrefixString(String s, String[] words) {
        boolean res = false;
        StringBuilder ans = new StringBuilder("");
        for(String word : words){
            ans.append(word);
            if(s.equals(ans.toString())){
                res = true;
            }
        }


        return res;
    }
}
