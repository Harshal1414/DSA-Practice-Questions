public class LC_238_Product_of_Array_Except_Self{
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0, right = nums.length - 1, var1 = 1, var2 = 1;
        for(int i = 0; i < nums.length; i++){
            while(left < i){
                var1 = var1 * nums[left];
                left++;
            }
            while(right > i){
                var2 = var2 * nums[right];
                right--;
            }
            ans[i] = var1 * var2;
        }
        return ans;
    }
}