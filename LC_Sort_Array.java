public class LC_Sort_Array {
    public void sortColors(int[] array) {
        int zero = 0, one = 0, two = 0;
        for(int i = 0; i<array.length;i++){
            if(array[i]==0)zero++;
            if(array[i]==1)one++;
            if(array[i]==2)two++;
        }
        for(int i=0;i<zero;i++)array[i]=0;
        for(int i=zero;i<one+zero;i++)array[i]=1;
        for(int i=one+zero;i<array.length;i++)array[i]=2;
    }
}
