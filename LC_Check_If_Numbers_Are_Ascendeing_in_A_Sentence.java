public class LC_Check_If_Numbers_Are_Ascendeing_in_A_Sentence {
    public boolean areNumbersAscending(String s){
        String [] arr = s.split(" ");
        int prev = 0; 
        for(String str : arr){
            try{
                int n = Integer.parseInt(str);
                if(n<=prev){
                    return false;
                }
                prev = n;
            }
            catch(Exception ex){}
        }
        return true;
    }
}
