/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if (head == null) return  null;
        if (head.next == null) {
            if (head.val == val) {
                return null;
            } else return head;
        } 
        ListNode node = removeElements(head.next, val);
        
        if (head.val == val) {
            return node;
        } else {
            head.next = node;
            return head;
        }
    }
}