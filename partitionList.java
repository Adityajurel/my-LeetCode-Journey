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
    public ListNode partition(ListNode head, int x) {
        ListNode d = new ListNode(-1);
        ListNode e = new ListNode(-1);
        ListNode u =e;
        ListNode t = d;
        ListNode i =head;
        while(i!= null){
            if(i.val<x){
                t.next = i;
                t=i;
            }
          else{
            u.next =i;
            u=i;
          }
          i=i.next;
        }
        u.next =null;
    t.next =e.next;

        return d.next;
    }
}
