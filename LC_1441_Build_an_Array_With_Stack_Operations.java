import java.util.*;

public class LC_1441_Build_an_Array_With_Stack_Operations {
    public List<String> buildArray(int[] target, int n) {
        int numOperations = target.length;
        numOperations += (target[target.length - 1] - target.length) * 2;
        List<String> ans = new ArrayList<>(numOperations);
        int input = 1;
        for(int i : target){
            while(input < i){
                ans.add("Push");
                ans.add("Pop");
                input++;
            }
            ans.add("Push");
            input++;
        }
        return ans;
    }
}
