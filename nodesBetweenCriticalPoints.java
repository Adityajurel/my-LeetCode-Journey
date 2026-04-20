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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[]arr = new int[2];
        arr[0]=-1;
        arr[1]=-1;
        if(head.next.next ==null) return arr;
        ListNode t1 = head;
        ListNode t2=t1.next;
        int newcp=-1;
        int oldcp=-1;
        int size =1;
        int fcp =0;
        int md = Integer.MAX_VALUE;
        while(t2.next!=null){
            if((t2.val>t1.val&&t2.val>t2.next.val)||(t2.val<t1.val&&t2.val<t2.next.val)){
              oldcp = newcp;
              newcp = size;
              if(fcp==0) fcp =newcp;
              if(oldcp!=-1){
              int minD=newcp-oldcp;
              if(minD<md){
                md = minD;
                arr[0]=md;
              }}
                
            }
                t2=t2.next;
                t1=t1.next;
            size++;
        }
        if(oldcp!=-1) arr[1]=newcp-fcp;
        return arr;
    }
}
