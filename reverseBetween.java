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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head==null||head.next==null) return head;
        ListNode d =new ListNode(-1);
        ListNode bl = d;
        bl.next =head;
        int i =1;
        while(i<l){
            bl = bl.next;
            i++;
        }
        ListNode ar=head;
        int j=1;
        while(j<=r){
            ar=ar.next;
            j++;
        }
        ListNode c = bl.next;
        ListNode cl = bl.next;
        ListNode p=null;
        ListNode fw=null;
        while(c!=ar){
            fw=c.next;
            c.next=p;
            p = c;
            c=fw;
        }
        bl.next = p;
        cl.next = ar;
        return d.next;


    }
}
