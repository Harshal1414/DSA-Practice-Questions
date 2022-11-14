public class LC_389_Find_the_Difference {
    public char findTheDifference(String s, String t){
        int freqArr [] = new int[26];

        for(int i = 0; i < s.length(); i++){
            freqArr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            freqArr[t.charAt(i) - 'a']++;
        }

        for(int ele : freqArr){
            if(ele != 0){
                return (char) (ele + 97);
            }
        }

        return 'a';
    }
}
