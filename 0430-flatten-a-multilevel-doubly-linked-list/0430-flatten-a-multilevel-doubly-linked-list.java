/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node t= head;
        
        while(t!=null){
        if(t.child!=null){
            Node a= t.next;
            Node  c= flatten(t.child);
                t.child=null;
        t.next= c;
        c.prev=t;
            
        
        while(c.next!=null){
            c=c.next;
        }
        c.next= a;
       if(a!=null) a.prev= c;
            }else t=t.next;
        }
      
        return head;
    }
}