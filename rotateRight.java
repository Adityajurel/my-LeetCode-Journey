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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        ListNode temp = head;
        ListNode i = head;
        int size =1;
        while(temp.next!=null){
            size++;
            temp= temp.next;
        }
        temp.next = head;
        int n =k%size;
        for(int l =1;l<=size-n-1;l++){
         i=i.next;
        }
        head=i.next;
        i.next = null;
        return head;
    }
}
