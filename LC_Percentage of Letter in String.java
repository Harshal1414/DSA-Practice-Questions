class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        int percentage = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==letter){
                count++;
            }
            
        }
        percentage = (count*100)/s.length();
        return percentage;
    }
}