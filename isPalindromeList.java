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
        if(head ==null||head.next == null) return true;
        ListNode s =head;
        ListNode fst =head;
        while(fst.next!=null&&fst.next.next!=null){
            s=s.next;
            fst=fst.next.next;
        }

        ListNode c = s.next;
        s.next =null;
        ListNode p =null;
        ListNode f = null;
    while(c!=null){
        f = c.next;
        c.next = p;
        p= c;
        c =f; 
    }
    ListNode temp =head;
    while(p!=null){
        if(p.val!= temp.val) return false;
        temp =temp.next;
        p=p.next;
    }
    return true;
    }
}
