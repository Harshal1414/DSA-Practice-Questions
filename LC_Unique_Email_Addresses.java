import java.util.*;

public class LC_Unique_Email_Addresses {
    public int numUniqueEmails(String[] emails){
        Set<String> accept = new HashSet<>();
        for(String email : emails){
            int atIndex = email.indexOf("@");
            int plusIndex = email.indexOf("+");
            String str = "";
            if(plusIndex >= 0){
                str = email.substring(0, plusIndex);
            }
            else{
                str = email.substring(0, atIndex);
            }
            str = str.replace(".", "") + email.substring(atIndex);
            accept.add(str);

        }
        return accept.size();
    }
}
