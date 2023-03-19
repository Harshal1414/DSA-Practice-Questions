import java.util.Stack;

public class LC_2216_Minimum_deletions_to_Make_Array_Beautiful {
    public int minDeletion(int[] nums){
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(!st.isEmpty()){
                if(st.size() % 2 == 0){
                    st.push(nums[i]);
                }
                else{
                    if(st.peek() == nums[i]){
                        count++;
                    }
                    else{
                        st.push(nums[i]);
                    }
                }
            }
            else{
                st.push(nums[i]);
            }
        }
        if(st.size() % 2 !=0){
            count++;
        }
        return count;
    }
}
