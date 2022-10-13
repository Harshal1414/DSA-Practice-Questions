class Solution {
    public String truncateSentence(String s, int k) {
        String [] arr = null;
        arr = s.split(" ");
        String[] arr1 = new String[k];
        for(int i = 0; i<k; i++){
            arr1[i] = arr[i];
        }
        String str = "";
        for(int i =0; i<k; i++){
            str = str + arr[i];
            if(i!=(k-1)){
                str = str+" ";
            }
        }
        return str;
    }
}