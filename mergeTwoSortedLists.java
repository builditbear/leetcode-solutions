public class mergeTwoSortedLists{
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return null;
        } else if(list1 == null) {
            return list2;
        } else if(list2 == null) {
            return list1;
        } else {
            // Choosing the list whose head has the least value guarantees that no values left to be compared will be less than
            // the value of currentNode1 at any time.
            ListNode combinedList = (list2.val >= list1.val ? list1 : list2);
            ListNode transferringList = (list2.val >= list1.val ? list2: list1);
            // Checking to see that the value of a node is between that of its neighbors guarantees that nodes will be inserted in the right
            // order the first time.
            ListNode currentNode = combinedList;
            ListNode currentTransferringNode = transferringList;
            while(currentTransferringNode != null) {
                // Store reference for node after current head of list2.
                ListNode temp2 = currentTransferringNode.next;
                ListNode temp1 = currentNode.next;
                // If the value of the node we're inserting is more than the current node but less than the next, it should be inserted.
                if(currentTransferringNode.val >= currentNode.val) {
                    if(currentNode.next == null || (currentTransferringNode.val <= currentNode.next.val)) {
                        // Attach head of list 2 to currentNode, then link former head of list 2 to next node in list1.
                        currentNode.next = currentTransferringNode;
                        currentTransferringNode.next = temp1;
                    } else {
                        // If the transferring node's value is not between the values of the two nodes being compared, we need to
                        // move on to the next node in the combine list and find it an appropriate place.
                        currentNode = currentNode.next;
                        continue;
                    }
                }
                currentTransferringNode = temp2;
                currentNode = currentNode.next;
            }
            // Either the original head of the now empty list2 or the head of list1 must be the LSE, and therefore
            // should be the head of the new list.
            return combinedList;
        }
    }
}