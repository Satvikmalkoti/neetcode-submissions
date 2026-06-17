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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode h:lists){
           while(h!=null){
            arr.add(h.val);
            h = h.next;
            }
        }
         
        Collections.sort(arr);
        ListNode head = new ListNode(-1);
        ListNode dummy = head;
        for(int i:arr){
            dummy.next = new ListNode(i);
            dummy = dummy.next;
        }
        return head.next;
    }
}
