public class LC_Crawler_Log_Folder {
    public int minOperations(String[] logs){
        int count = 0;
        for(int i = 0; i < logs.length; i++){
            if(logs[i].endsWith("../")){
                count = Math.max(0, --count);
            }
            else if(logs[i].endsWith("./")){
                continue;
            }
            else{
                count++;
            }
        }

        return count;
    }
}
