public class LC_1614_Maximum_Nesting_Depth_of_the_Parentheses {
    public int maxDepth(String s) {
        int depth = 0, open = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                open++;
                depth = Math.max(depth, open);
            }
            else if(c == ')'){
                open--;
            }
        }
        return depth;
    }
}
