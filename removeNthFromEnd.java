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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next ==null) return null;
        ListNode f= head;
        ListNode s= head;
        ListNode prev = null;
        int size=0;
        for(int i =1;i<=n;i++){
       
            f=f.next;
            size++;
        }
        while(f!=null){
            prev = s;
            s= s.next;
            f=f.next;
            size++;
        }
        if(n==size){
            head= head.next;
            return head;
        }
        prev.next=s.next;
        return head;
    }
}
