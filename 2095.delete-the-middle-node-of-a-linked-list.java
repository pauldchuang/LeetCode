/*
 * @lc app=leetcode id=2095 lang=java
 *
 * [2095] Delete the Middle Node of a Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null)
            return null;
        ListNode slow1 = head, fast1 = head;
        ListNode slow2 = head.next;
        ListNode fast2 = head.next.next;
        while (fast2 != null && fast2.next != null) {
            slow1 = slow2;
            fast1 = fast2;
            slow2 = slow2.next;
            fast2 = fast2.next.next;
        }
        slow1.next = slow2.next;
        return head;
    }
}
// @lc code=end
