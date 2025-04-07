package LinkedList;

/* Leetcode Ques 206 : Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list. */

// Using Recursion

public class ReverseLinkedListRecursion {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        return reverse(head , null);
    }
    public ListNode reverse(ListNode curr , ListNode prev){
        if (curr == null) {
            return prev;
        }
        ListNode temp = reverse(curr.next , curr);
        curr.next = prev;
        return temp;
    }
}

