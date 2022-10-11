class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(String sentence: sentences){
            String[] arr = sentence.split(" ");
            if(arr.length > count){
                count = arr.length;
            }
        }
        return count;
    }
}
// The string split() method breaks a given string around matches of the given regular expression. After splitting against the given regular expression, this method returns a string array.