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
    public void reorderList(ListNode head) {
        //base conditions
        if(head == null || head.next == null) return; 
        
        //find the middle of linkedlist
        ListNode slow = head, fast = head, prev = null;
        
        while(fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        
        prev.next = null;
        ListNode p1 = head, p2 = reverse(slow);
        
        while(p1 != null && p2 !=null) {
            ListNode next1 = p1.next, next2 = p2.next;
            p1.next = p2;
            p2.next = next1 == null ? next2 : next1;
            
            p1 = next1;
            p2 = next2;
        }
        
        
        
        
        
    }
    
    public ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null;
        
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}