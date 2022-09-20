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
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
         int carry =  0, value = 0;
        ListNode sentinel = new ListNode(0);
        ListNode curr = sentinel;
        first = reverseList(first);
        second = reverseList(second);
        
        while(first != null ||  second != null || carry != 0){
            int a = first != null ? first.val : 0;
            int b = second != null ? second.val : 0;
            int sum = a+b+carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            first = first != null ? first.next : null;
            second = second != null ? second.next : null;
        }    
        return reverseList(sentinel.next);
    }
    
        static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}