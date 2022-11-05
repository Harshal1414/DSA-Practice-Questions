public class LC_Counting_Words_with_A_Given_Prefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0; 
        for(int i = 0; i<words.length; i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
