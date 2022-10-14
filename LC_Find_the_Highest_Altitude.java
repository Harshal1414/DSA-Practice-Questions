class Solution {
    public int largestAltitude(int[] gain) {
        int[] ini = new int[gain.length+1];
        ini[0] = 0;
        int max = ini[0];
        for(int i =1; i<ini.length; i++){
            ini[i] = ini[i-1]+gain[i-1];
            if(ini[i] > max){
                max = ini[i];
            }
        }
        return max;
    }
}