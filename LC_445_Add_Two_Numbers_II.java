import java.util.Stack;

public class LC_445_Add_Two_Numbers_II {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;

        ListNode list = new ListNode(0);
        ListNode curr = list;

        while (!s1.isEmpty() || !s2.isEmpty()){
            int sum = 0;
            if(!s1.isEmpty()) sum += s1.pop();
            if(!s2.isEmpty()) sum += s2.pop();

            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
        if(carry > 0) curr.next = new ListNode(carry);
        

        // Reversing a Linked List

        ListNode prev = list.next;
        ListNode curr1 = prev.next;

        while(curr1 != null){
            ListNode nextNode = curr1.next;
            curr1.next = prev;

            // Update
            prev = curr1;
            curr1 = nextNode;
        }
        list.next.next = null;
        list.next = prev;

        return list.next;
    }
}
