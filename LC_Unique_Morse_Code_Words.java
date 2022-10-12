import java.util.*;
import java.lang.*;

public class LC_Unique_Morse_Code_Words {
    public int uniqueMorseRepresentations(String[] words) {
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> unique_codes = new HashSet<>();

        for(String word : words){
            StringBuilder transformation = new StringBuilder();

            // now we have to store morse code character array of each word into StringBuilder.
            for(char c : word.toCharArray()){
                transformation.append(morse[c-'a']);
            }

            unique_codes.add(transformation.toString());
        }
        return unique_codes.size();
    }
}

// HashSet are used just because it always contains unique values.
