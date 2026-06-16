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
        // TO FIND MIDDLE OF LL USING SLOW FAST
        // when fast is at last, slow is at middle, as fast moves 2 nodes and slow moves 1 in each iteration
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //move slow by 1 node, and set end of first ll to null
        ListNode p = null;
        ListNode q = slow.next;
        slow.next = null;
        //reverse the second ll that starts with q;
        while(q!=null){
            ListNode temp = q.next;
            q.next = p;
            p = q;
            q = temp;
        }
        //set head ptr for first and second ll
        ListNode first = head;
        ListNode second = p;
        //merge both using the required condition 0,n-1,1,n-2,2....
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }

         
    }
}
