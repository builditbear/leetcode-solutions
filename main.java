

public class main {
    public static void main(String[] args) {
        // TEST CODE: No. 21 - Merge Two Sorted Lists
        // ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        // ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(4)));
        
        // ListNode n = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        // while(n != null) {
        //     System.out.println(n.val);
        //     n = n.next;
        // }

        //TEST CODE: No. 20 - Valid Parentheses
        // String s = "({{{{}}}))";
        // System.out.println(ValidParentheses.isValid(s));

        //TEST CODE: No. 26 - RemoveDuplicates
        // int[] nums = {-1,0,0,0,0,3,3};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        // int[] nums = {1,1,2};
        // int[] nums = {1,1};
        // int[] nums = {};
        int uniqueIntegerCount = RemoveDuplicates.removeDuplicates(nums);
        System.out.println(uniqueIntegerCount);
        System.out.println();
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
        for(int i = 0; i < uniqueIntegerCount; i++) {
            System.out.println(nums[i]);
        }
    }
}
