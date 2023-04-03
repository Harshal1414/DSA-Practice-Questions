public class LC_2130_Maximum_Twin_Sum_of_a_Linked_List{
    public int pairSum(ListNode head){
        if(head == null){
            return 0;
        }
        if(head.next == null){
            return head.val;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverese(slow);
        fast = head;
        int sum = Integer.MIN_VALUE;

        while(slow != null){
            sum = Math.max(slow.val + fast.val, sum);
            slow = slow.next;
            fast = fast.next;
        }
        return sum;
    }

    private ListNode reverse(ListNode node){
        if(node == null){
            return null;
        }
        ListNode curr = node;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}