public class LC_Check_If_N_And__Its_Double_Exist {
    public boolean checkIfExist(int[] arr){
        boolean ans = false;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length-1; j++){
                if(arr[j] == 2*arr[i]|| arr[i] == 2*arr[j]){
                    ans = true;
                }
            }
        }

        return ans;
    }
}
