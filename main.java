

public class main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(4)));
        
        ListNode n = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        while(n != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }
}
