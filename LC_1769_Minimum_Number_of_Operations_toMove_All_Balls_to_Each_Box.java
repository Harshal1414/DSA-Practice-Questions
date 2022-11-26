public class LC_1769_Minimum_Number_of_Operations_toMove_All_Balls_to_Each_Box {
    public int[] minOperations(String boxes){
        int n = boxes.length();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j =0; j < n; j++){
                if(boxes.charAt(j) == '1'){
                    count += Math.abs(i-j);
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    // Approach 2 with good time and space complexities.

    public int[] minOperations1(String boxes) {
        int n = boxes.length();

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        int count = boxes.charAt(0) - '0';
        for(int i = 1 ; i < n ; i++){
            left[i] = left[i - 1] + count;
            count += boxes.charAt(i) - '0';
        }

        count = boxes.charAt(n - 1) - '0';
        for(int i = n - 2 ; i >=0 ; i--){
            right[i] = right[i + 1] + count;
            count += boxes.charAt(i) - '0';
        }
		
        for(int i = 0 ; i < n ; i++) {
            ans[i] = left[i] + right[i];
        }

        return ans;
    }
}
