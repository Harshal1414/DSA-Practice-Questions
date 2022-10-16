import java.util.*;
import java.lang.*;

public class LC_Rings_and_Rods {
    public int countPoints(String rings){
        Set<Integer> r = new HashSet<>(), g = new HashSet<>(), b = new HashSet<>();
        for(int i = 0; i<rings.length(); i+=2){
            if(rings.charAt(i) == 'R'){
                r.add(rings.charAt(i+1)-'0');
            }
            else if(rings.charAt(i) == 'G'){
                g.add(rings.charAt(i+1)-'0');
            }
            else if(rings.charAt(i) == 'B'){
                b.add(rings.charAt(i+1)-'0');
            }
        }

        int count = 0;
        for(int i = 0; i<10; i++){
            if(r.contains(i) && g.contains(i) && b.contains(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        LC_Rings_and_Rods obj = new LC_Rings_and_Rods();
        System.out.println(obj.countPoints(rings));
    }
}

// string.charAt(i) - '0'converts it to an integer.
// else we can use - Integer.parseInt(), Character.isDigit(char), Character.getNumericValue(char)