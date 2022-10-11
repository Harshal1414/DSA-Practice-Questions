class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        for(int i = 0; i<A.length; i++){
            sumA += A[i];
        }
        for(int i = 0; i<B.length; i++){
            sumB += B[i];
        }
        for (int i = A.length-1; i>=0; i--){
            for(int j =B.length-1; j>=0; j--){
                int diff = A[i]-B[j];
                int sumA1 = sumA-diff;
                int sumB1 = sumB+diff;
                if(sumA1==sumB1){
                    return new int[]{A[i], B[j]};
                }
            }
        }
        return null;
    }
}