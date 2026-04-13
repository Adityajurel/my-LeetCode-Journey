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



    ListNode merge(ListNode a,ListNode b){
        ListNode t1 = a;
        ListNode t2= b;
        ListNode d = new ListNode(-1);
        ListNode t = d;
        while(t1!=null&&t2!=null){
            if(t1.val<=t2.val){
                t.next =t1;
                t=t1;
                t1=t1.next;
            }
            else{
                t.next = t2;
                t = t2;
                t2= t2.next;
            }
        }
        if(t1!=null) t.next=t1;
        if(t2!=null) t.next=t2;
        return d.next;

    }
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> Arr =  new ArrayList<>();
        for(ListNode i :lists){
            Arr.add(i);
        }
        if(Arr.size()==0) return null;
        while(Arr.size()>1){
            ListNode a = Arr.get(Arr.size()-1);
            Arr.remove(Arr.size()-1);
            ListNode b = Arr.get(Arr.size()-1);
            Arr.remove(Arr.size()-1);
           ListNode c = merge(a,b);
            Arr.add(c);
        }
        return Arr.get(0);
    }
}
