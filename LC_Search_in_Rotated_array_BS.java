// https://leetcode.com/problems/search-in-rotated-sorted-array/
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            if (nums[start]==target){
                return start;
            }
            else if (nums[end] == target){
                return end;
            }
            else if (nums[start] < target){
                start++;
            }
            else if (nums[end] > target){
                end--;
            }
            else{
                break;
            }
        }
        return -1;
    }
}