import java.util.*;
public class LC_Decode_the_Message {
    public String decodeMessage(String key, String message){
        StringBuilder ans = new StringBuilder();
        key = key.replaceAll(" ", ""); 
        // Removing the Spaces
        // HashMap is used just because we have to store values in pairs.
        HashMap<Character, Character> letters = new HashMap<>();
        // Mapping the Key into HashMap
        char alphabet = 'a';
        for(int i = 0; i<key.length(); i++){
            if(!letters.containsKey(key.charAt(i))){
                letters.put(key.charAt(i), alphabet++);
            }
        }
        //After the first pass all the letters of the key will be mapped with their respective original letters.
        for(int i = 0; i<message.length(); i++){
            if(letters.containsKey(message.charAt(i))){
                ans.append(letters.get(message.charAt(i)));
            }
            else{
                ans.append(message.charAt(i));
            }
        }
        return ans.toString();
        // A toString() is an in-built method in Java that returns the value given to it in string format. Hence, any object that this method is applied on, will then be returned as a string object.
    }
}