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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ListNode f= head;
        ListNode s= head;
        ListNode prev= head;
        while(f!=null&&f.next!=null){
            prev= s;
            s=s.next;
            f=f.next.next;
        }
        if(f!=null&&f.next==null) s=s.next;
        prev.next= null;
        ListNode p=null;
        ListNode n=s.next;
        while(n!=null){
            s.next= p;
            p=s;
            s=n;
            n=n.next;
        }
        s.next=p;
        ListNode t=head;
        while(t!=null){
            if(t.val!=s.val) return false;
            s=s.next;
            t=t.next;
        }
        return true;
    }
}