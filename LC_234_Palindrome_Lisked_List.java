import java.util.Stack;

public class LC_234_Palindrome_Lisked_List {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack stack = new Stack<>();
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }

        while(head != null){
            if(head.val != (int) stack.pop()){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
