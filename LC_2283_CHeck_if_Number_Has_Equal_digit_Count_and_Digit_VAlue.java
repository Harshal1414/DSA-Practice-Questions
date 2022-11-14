import java.util.HashMap;

public class LC_2283_CHeck_if_Number_Has_Equal_digit_Count_and_Digit_VAlue {
    public boolean digitCount(String num){
        int freqArr [] = new int[10];

        for(char ch : num.toCharArray()){
            freqArr[ch - '0']++;
        }

        for(int i = 0; i<num.length(); i++){
            int freq = num.charAt(i) - '0';
            freqArr[i] = freqArr[i] - freq;
        }
        for(int i = 0; i < 10; i++){
            if(freqArr[i] != 0){
                return false;
            }
        }
        return true;
    }
}
