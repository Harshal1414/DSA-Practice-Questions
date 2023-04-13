public class LC_1669_Merge_in_Between_Linked_Lists{
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1;
        for(int i = 0; i < a; ++i){
            start = start.next;
        }

        ListNode end = start;
        for(int i = a; i <= b; i++){
            end = end.next;
        }
        start.next = list2;
        while(list2.next != null) {
            list2 = list2.next;
        }
        list2.next = end.next;
        return list1;
    }
}