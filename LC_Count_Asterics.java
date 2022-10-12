public class LC_Count_Asterics {
    public int countAsterisks(String s){
        boolean flag = false;
        int count = 0; 
        for(char ch : s.toCharArray()){
            if(!flag && ch == '*'){
                count++;
            }
            if(ch == '|'){
                flag = !flag;
            }
        }
        return count;
    }
}
