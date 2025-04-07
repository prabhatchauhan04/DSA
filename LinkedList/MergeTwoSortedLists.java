package LinkedList;

/* LeetCode Ques 21 : Merge Two Sorted Lists 
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
*/

public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution{
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode Dummy = new ListNode();
            ListNode temp = Dummy;
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    Dummy.next = list1;
                    list1 = list1.next;
                    Dummy = Dummy.next;
                } else {
                    Dummy.next = list2;
                    list2 = list2.next;
                    Dummy = Dummy.next;
                }
            }
            if (list1 != null) {
                Dummy.next = list1;
            }
            if (list2 != null) {
                Dummy.next = list2;
            }
            temp = temp.next;
            return temp;
        }
    }
}
