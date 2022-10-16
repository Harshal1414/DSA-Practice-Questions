public class LC_Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i = 0; i<patterns.length; i++){
            boolean flag = word.contains(patterns[i]);
            if(flag){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String [] patterns = {"a","abc","bc","d"};
        String word = "abc";
        LC_Number_of_Strings_That_Appear_as_Substrings_in_Word obj = new LC_Number_of_Strings_That_Appear_as_Substrings_in_Word();
        System.out.println(obj.numOfStrings(patterns, word));
    }
}
