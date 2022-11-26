public class LC_2391_Minimum_amount_of_Time_to_Collect_Garbage {
    public int garbageCollection(String[] garbage, int[] travel){
        int m = 0;  // M
        int p = 0;  // P
        int g = 0;  // G
        int sum = 0;

        for(int i = 1; i <= garbage.length; i++){
            for(char c : garbage[i].toCharArray()){
                if(c == 'M'){
                    m = i;
                }
                else if(c == 'P'){
                    p = i;
                }
                else if(c == 'G'){
                    g = i;
                }
                sum++;
            }
        }

        for(int i = 1; i < travel.length; i++){
            travel[i] += travel[i-1];
        }

        if(m != 0){
            sum += travel[m-1];
        }
        if(p != 0){
            sum += travel[p-1];
        }
        if(g != 0){
            sum += travel[g-1];
        }

        return sum;
    }
}
