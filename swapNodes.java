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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode temp =head;
        int size =0;
        int a1=0;
        int a2=0;
        while(temp!=null){
            size++;
            temp= temp.next;
        }
        temp = head;
        for(int i =1;i<=size;i++){
            
            if(i==k)  a1=temp.val;
            if(i==size-k+1) a2= temp.val;
            temp= temp.next;
        }
        temp = head;
        for(int i =1;i<=size;i++){
            
            if(i==k) temp.val=a2;
            if(i==size-k+1)  temp.val=a1;
            temp= temp.next;
        }
    return head;
    }
}
