import java.util.Stack;

public class LC_2487_Remove_Nodes_From_Linked_List {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        while(head != null){
            if(st.size() == 0){
                st.add(head.val);
            }
            else{
                int curr = head.val;
                while(!st.isEmpty() && st.peek() < curr){
                    st.pop();
                }
                st.push(curr);
            }
            head = head.next;
        }

        ListNode prev = null;
        ListNode curr = null;

        while(!st.isEmpty()){
            curr = new ListNode(st.pop());
            curr.next = prev;  
            prev = curr;
        }
        return curr;
    }
}