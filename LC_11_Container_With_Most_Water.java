// https://www.youtube.com/watch?v=ZHQg07n_tbg&t=26s&ab_channel=Codebix
public class LC_11_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while(left < right){
            int lh = height[left];
            int bh = height[right];
            int min_height = Math.min(lh, bh);
            max = Math.max(max, min_height * (right - left));
            if(lh < bh) left++;
            else right--;
        }
        return max;
    }
}
