public class LC_2133_Check_If_Every_Row_and_Column_Contains_All_Numbers {
    public boolean checkValid(int[][] matrix){
        int n = matrix.length;
        for(int r = 0; r < n; r++){
            boolean rVis[] = new boolean[n];
            boolean cVis[] = new boolean[n];
            for(int c = 0; c < n; c++){
                int rVal = matrix[r][c];
                int cVal = matrix[c][r];

                if(rVis[rVal] == true || cVis[cVal] == true){  // for repetition
                    return false; // matrix is not valid;
                }
                rVis[rVal] = true;
                cVis[cVal] = true;
            }
        }
        return true;
    }
}
