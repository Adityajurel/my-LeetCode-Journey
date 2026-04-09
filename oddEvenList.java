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
    public ListNode oddEvenList(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode odd =d1;
        ListNode even = d2;
        ListNode i = head;
        int count =1;
        while(i!=null){
            if(count%2==1){
                odd.next = i;
                odd =i;
            } else{
                even.next =i;
                even = i;
            }
            i= i.next;
            count++;
        }
    even.next = null;
    odd.next=d2.next;
    return d1.next;
    }
}
