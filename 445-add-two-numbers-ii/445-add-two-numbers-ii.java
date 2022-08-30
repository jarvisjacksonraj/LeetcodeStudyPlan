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
        ListNode sentinel = null;
        
        first = reverseList(first);
        second = reverseList(second);
        
        while(first != null ||  second != null){
            int a = first != null ? first.val : 0;
            int b = second != null ? second.val : 0;
            int sum = a+b+carry;
            value = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(value);

            newNode.next = sentinel;
            sentinel = newNode;
            first = first != null ? first.next : null;
            second = second != null ? second.next : null;
        }
        
        if(carry != 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = sentinel;
            sentinel = newNode;
        }
        
        
        return sentinel;
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