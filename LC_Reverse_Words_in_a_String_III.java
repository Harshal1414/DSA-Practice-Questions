class Solution {
    public String reverseWords(String s) {
        String[] arr = null;
        // Split the String 's' using regex " ".
        arr = s.split(" ");
        
        // Reverse each word in the 'words' array.
        for(int i = 0; i<arr.length; i++){
            arr[i] = new StringBuilder (arr[i]).reverse().toString();
        }
        return String.join(" ", arr);
    }
}