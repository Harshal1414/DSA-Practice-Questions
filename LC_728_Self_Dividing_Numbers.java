import java.util.*;
public class LC_728_Self_Dividing_Numbers {
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> list = new ArrayList<>();
        for(int i = left; i<=right; i++){
            if(selfDividing(i)){
                list.add(i);
            }
        }

        return list;
    }

    public boolean selfDividing(int n){
        int temp = n;

        while(temp>0){
            int last = temp%10;
            if(last == 0) return false;
            if(n % last != 0) return false;

            temp = temp/10;
        }
        return true;
    }
}
