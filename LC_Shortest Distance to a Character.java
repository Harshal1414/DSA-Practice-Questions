class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<>();
        char[] c1 = s.toCharArray();
        for(int i = 0; i<c1.length; i++){
            if(c1[i] == c){
                list.add(i);
            }
        }

        int res [] = new int [c1.length];
        for(int i = 0; i<res.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j : list){
                min = Math.min(min, Math.abs(i-j));
            }
            res[i]=min;
        }
        return res;
    }
}