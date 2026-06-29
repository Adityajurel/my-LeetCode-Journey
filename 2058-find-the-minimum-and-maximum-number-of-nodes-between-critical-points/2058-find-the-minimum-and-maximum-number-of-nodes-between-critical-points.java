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
        ListNode t=head.next;
        ListNode p= head;
        int[]arr= {-1,-1};
        int cpct=0;
        int idx=2;
        int oldcp=-1;
        int fcp=0;
        while(t.next!=null){
            if(t.val>p.val&&t.val>t.next.val){
                cpct++;
                if(cpct>1){
                    if(cpct==2)arr[0]=idx-oldcp;
                    else arr[0]=Math.min(idx-oldcp,arr[0]);
                }
                if(cpct>1){
                    arr[1]=idx-fcp;
                }
                if(cpct==1)fcp=idx;
                oldcp=idx;
            }
            else if(t.val<p.val&&t.val<t.next.val){
                           cpct++;
                if(cpct>1){
                    if(cpct==2)arr[0]=idx-oldcp;
                    else arr[0]=Math.min(idx-oldcp,arr[0]);
                }
                if(cpct>1){
                    arr[1]=idx-fcp;
                }
                if(cpct==1)fcp=idx;
                oldcp=idx;
            }
            p=t;
            t=t.next;
            idx++;
            }
        
        return arr;
    }
}