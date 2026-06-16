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
    public boolean hasCycle(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;

        while(fastptr!=null){
            slowptr = slowptr.next;
            fastptr = fastptr.next;
            if(fastptr == null) return false;
            fastptr = fastptr.next;
            if(slowptr == fastptr) return true;
        }
        return false;
    }
}
