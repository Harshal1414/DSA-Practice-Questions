import java.util.ArrayList;
import java.util.Stack;

public class LC_1019_Next_Greater_Node_In_Linked_List {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode node = head; node != null; node = node.next){
            list.add(node.val);
        }

        int [] res = new int[list.size()];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < list.size(); i++){
            while(!st.isEmpty() && list.get(st.peek()) < list.get(i)){
                res[st.pop()] = list.get(i);
            }
            st.push(i);
        }

        return res;
    }
}
