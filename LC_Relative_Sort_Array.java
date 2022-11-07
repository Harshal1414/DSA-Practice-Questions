import java.util.Arrays;
import java.util.HashMap;

public class LC_Relative_Sort_Array {
    public int[] relativeSortArray(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr2){
            map.put(num, 0);
        }
        int last = arr1.length-1;
        int [] res = new int[arr1.length];
        for(int num : arr1){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);  // incrementint count - if number is from arr2
            }
            else{
                res[last--] = num;
            }
        }

        int p = 0; 
        for(int num : arr2){
            int k = map.get(num);
            for(int i = 0; i <k; i++){
                res[p++]=num;
            }
        }

        Arrays.sort(res, p, res.length);
        return res;
    }
}
