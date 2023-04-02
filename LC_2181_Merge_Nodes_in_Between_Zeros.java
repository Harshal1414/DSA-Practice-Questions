public class LC_2181_Merge_Nodes_in_Between_Zeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode ptr = res;
        ListNode temp = head;

        temp = temp.next;

        while(temp != null){
            
            int sum = 0;
            
            while(temp.val != 0){
                sum += temp.val;
                temp = temp.next;
            }

            ptr.next = new ListNode(sum);
            ptr = ptr.next;
            temp = temp.next;
        }
        return res.next;
    }
}
