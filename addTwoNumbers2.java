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
    ListNode rev(ListNode l1){
        ListNode c = l1;
        ListNode p= null;
        ListNode fw= null;
        while(c!=null){
            fw = c.next;
            c.next=p;
            p =c;
            c=fw;
        }
        return p;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode newl1 = rev(l1);
      ListNode newl2=  rev(l2);
    ListNode t1=newl1;
    ListNode t2=newl2;
        ListNode d=new ListNode(-1);
        ListNode t=d;
        int sum =0;
        int carry =0;
    while(t1!=null&&t2!=null){
        sum = t1.val+t2.val+carry;
        ListNode c=new ListNode(sum%10);
        carry = sum/10;
        t.next =c;
        t = c;
        t1=t1.next;
        t2=t2.next;
    }
    while(t1!=null){
        sum = t1.val+carry;
        ListNode c=new ListNode(sum%10);
        carry = sum/10;
        t.next =c;
        t = c;
        t1=t1.next;
    }
        while(t2!=null){
        sum =t2.val+carry;
        ListNode c=new ListNode(sum%10);
        carry = sum/10;
        t.next =c;
        t = c;
        t2=t2.next;
    }
    if(carry>0){
    ListNode c=new ListNode(carry);
    t.next =c;
    t =c;
    t.next=null;
 
    }

    return rev(d.next);
    }
}
