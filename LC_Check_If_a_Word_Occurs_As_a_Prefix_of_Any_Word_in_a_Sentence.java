public class LC_Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {
    public int isPrefixOfWord(String sentence, String searchWord){
        String[] words = sentence.split(" ");
        for(int i = 1; i<=words.length; ++i){
            if(words[i-1].startsWith(searchWord)){
                return i;
            }
        }
        return -1;
    }
}
