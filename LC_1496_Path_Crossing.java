import java.util.*;

public class LC_1496_Path_Crossing {
    public boolean isPathCrossing(String path){
        Set<List<Integer>> set = new HashSet<>();
        int x = 0, y = 0;
        set.add(Arrays.asList(x,y));

        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'N') y++;
            if(path.charAt(i) == 'S') y--;
            if(path.charAt(i) == 'E') x++;
            if(path.charAt(i) == 'W') x--;

            if(set.contains(Arrays.asList(x,y))){
                return true;
            }
            else {
                set.add(Arrays.asList(x,y));
            }
        }
        return false;
    }
}
