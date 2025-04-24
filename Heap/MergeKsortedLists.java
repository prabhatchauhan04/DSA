package Heap;
import java.util.*;
/*
LeetCode Ques 23. Merge k Sorted Lists
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

Example 1:
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
*/

public class MergeKsortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    } 
    class Solution {
       public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> pq = new PriorityQueue<>();
            for (int i = 0; i < lists.length; i++) {
                if (lists != null) {
                    pq.add(lists[i]);
                }
            }
            ListNode Dummy = new ListNode();
            ListNode temp = Dummy;
            while (pq.isEmpty() == false) {
                ListNode rv = pq.poll();
                Dummy.next = rv;
                Dummy = Dummy.next;
                if (rv.next != null) {
                    pq.add(rv.next);
                }
            }
            return temp.next;
       }
    }
}
