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
    public int pairSum(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f.next.next!=null){
            s= s.next;
            f = f.next.next;
        }
        ListNode c= s.next;
        s.next=null;
        ListNode p = null;
        ListNode fw = null;
        while(c!=null){
            fw=c.next;
            c.next= p;
            p =c;
            c=fw;
        }
        int sum =0;
        ListNode t =head;
        while(t!=null){
           int  newsum =p.val+t.val;
            if(newsum>sum){
                sum = newsum;
            }
            t=t.next;
            p=p.next;
        }
        return sum;
    }
}
