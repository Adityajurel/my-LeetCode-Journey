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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode d = new ListNode(-1);
        ListNode ans = d;
        while(t1!=null&&t2!=null){
            if(t1.val<=t2.val){
                ans.next =t1;
                ans =t1;
                t1=t1.next;
            }
            else{
                ans.next =t2;
                ans = t2;
                t2=t2.next;
            }
        }
        if(t1==null){
            ans.next =t2;
            ans = t2;
        }
        else{
             ans.next =t1;
             ans = t1;
        }
        return d.next;
    }
}
