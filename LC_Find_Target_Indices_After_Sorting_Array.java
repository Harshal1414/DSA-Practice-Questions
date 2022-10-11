// Find Target Indices After Sorting Array
// https://leetcode.com/problems/find-target-indices-after-sorting-array/

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List <Integer> res = new ArrayList <>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==target){
                res.add(i);
            }
        }
        return res;
    }
}