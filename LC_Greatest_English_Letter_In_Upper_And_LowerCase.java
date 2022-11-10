class Solution {
    public String greatestLetter(String s) {
        char uc = 'Z';
        char lc = 'z';
        for(int i = 0; i < 26; i++){
            if(s.contains(Character.toString(uc)) && s.contains(Character.toString(lc))){
                return Character.toString(uc);
            }
            uc--;
            lc--;
        }
        return "";
    }
}