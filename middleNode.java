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
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        int size =0;
        int idx=0;
        while(f!=null){
        if(f.next==null)break;
            f= f.next.next;
            s=s.next;

        }
        head =s;
        return head;
    }
}
