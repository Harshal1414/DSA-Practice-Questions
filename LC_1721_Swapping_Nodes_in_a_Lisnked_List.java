public class LC_1721_Swapping_Nodes_in_a_Lisnked_List {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        int count = 0;

        // Find the kth Node from left
        while(left != null){
            count++;
            if(count == k){
                break;
            }
            left = left.next;
        }
        
        // Find the kth Node from right
        ListNode pNode = left;
        while(pNode.next != null){
            pNode = pNode.next;
            right = right.next;
        }
        
        //Swap their values.
        int temp = left.val;
        left.val = right.val;
        right.val = temp;

        return head;
    }
}
