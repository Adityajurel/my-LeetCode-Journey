


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
    public ListNode removeNodes(ListNode head) {
        Stack <ListNode> st = new Stack<>();
        ListNode t = head;
        while(t!=null){
            while(st.size()!=0&&st.peek().val<t.val){
                st.pop();
            }
            // st.push(t);
            if(st.size()==0)st.push(t);
            else if(st.size()!=0&&st.peek().val>=t.val)st.push(t);
            t=t.next;
        }
        if(st.size()!=0)head=st.pop();
        while(st.size()!=0){
            ListNode temp = st.pop();
            temp.next= head;
            head=temp;
        }
        return head;
    }
}