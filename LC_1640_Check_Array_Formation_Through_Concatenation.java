public class LC_1640_Check_Array_Formation_Through_Concatenation {
    public boolean canFormArray(int[] arr, int[][] pieces){
        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append("#");
            sb.append(i);
            sb.append("#");
        }

        for(int i = 0; i < pieces.length; i++){
            StringBuilder res = new StringBuilder();
            for(int j = 0; j < pieces[i].length; j++){
                res.append("#");
                res.append(pieces[i][j]);
                res.append("#");
            }
            if(!sb.toString().contains(res.toString())){
                return false;
            }
        }
        return true;
    }
}
