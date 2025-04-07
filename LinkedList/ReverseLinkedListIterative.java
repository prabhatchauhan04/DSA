package LinkedList;

/* Leetcode Ques 206 : Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list. */

// Using Loops

public class ReverseLinkedListIterative {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
}
