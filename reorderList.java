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
        ListNode s = head;
        ListNode f = head;
        while(f.next!=null&&f.next.next!=null){
            s= s.next;
            f = f.next.next;
        }
        ListNode c = s.next;
        s.next =null;
        ListNode p =null;
        ListNode fw= null;
        while(c!=null){
            fw = c.next;
            c.next=p;
            p= c;
            c=fw;
        }
      ListNode u = head;
      ListNode v = p;
      while(v!=null){
        ListNode t1= u.next;
        ListNode t2 = v.next;
        u.next = v;
        v.next =t1;
        u = t1;
        v= t2;

      }
    }
}
