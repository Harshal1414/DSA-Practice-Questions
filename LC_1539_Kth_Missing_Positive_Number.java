public class LC_1539_Kth_Missing_Positive_Number {
    public int findKthPositive(int[] arr, int k){
        int ans = 0;
        int n = arr.length;
        int index = 0;
        for(int i = 0; i <= arr[n-1]; i++){
            if(i == arr[index]){
                index++;
                continue;
            }
            else{
                k--;
            }
            if(k == 0){
                return i;
            }
        }
        return arr[n-1] + k;
    }
}
