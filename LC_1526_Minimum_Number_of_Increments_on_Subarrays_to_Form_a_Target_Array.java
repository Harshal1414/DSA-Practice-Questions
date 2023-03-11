public class LC_1526_Minimum_Number_of_Increments_on_Subarrays_to_Form_a_Target_Array {
    public int minNumberOperations(int[] target){
        int res = 0, pre = 0;
        for(int t : target){
            res += Math.max(t - pre, 0);
            pre = t;
        }
        return res;
    }
}
