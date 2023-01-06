public class LC_540_Single_Element_in_a_Sorted_Array {
    public int singleNonDuplicate(int[] nums){
        int start = 0, end = nums.length-1;
        while(start < end){
            int mid = start + (end-start)/2;        // divide the array
            if(nums[mid] == nums[mid+1]){
                mid = mid-1;        //two same elements should be in same half
            }
            if((mid - start + 1) % 2 != 0){
                end = mid;      // checking the length of left half. If its is odd then update ur right pointer to mid
            }
            else{
                start = mid+1;      // else your right half will be odd then update your left pointer to mid+1
            }
        }
        return nums[start];      //left pointer will have the answer at last
    }
}
// keep dividing your array in two halves and check in which half there are odd number of elements...that will be your required part.