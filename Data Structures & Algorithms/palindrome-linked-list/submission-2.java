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
    ListNode left;
    public boolean isPalindrome(ListNode head) {
        // ListNode fast = head;
        // ListNode slow = head;

        // while(fast!=null && fast.next!=null){
        //     fast = fast.next.next;
        //     slow = slow.next;
        // }
        // ListNode head2 = null;
        // if(fast==null){
        //      head2 = slow;
        // }
        // else if(fast.next==null){
        //      head2 = slow.next;
        // }

        // ListNode prev = null;
        // ListNode curr = head2;
        // while(curr!=null){
        //     ListNode temp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = temp;
        // }

        // head2 = prev;
        // ListNode head1 = head;
        // while(head2!=null){
        //     if(head1.val!=head2.val){
        //         return false;
        //     }
        //     head1 = head1.next;
        //     head2 = head2.next;
        // }
        // return true;

        //Recursion

        left = head;
        return check(head);
    }
    boolean check(ListNode right){

        if(right==null) return true;

        boolean result = check(right.next);

        if(!result) return false;

        if(left.val!=right.val) return false;
        left = left.next;
        return true;
    }
}