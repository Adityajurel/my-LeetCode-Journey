class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class MyCircularQueue {
 Node head;
 Node tail=head;
 int ct=1;int k=0;
    public MyCircularQueue(int size) {
    k=size;
    }
    
    public boolean enQueue(int value) {
        Node temp= new Node(value);
        if(ct==1){
            head= temp;
            tail=temp;
            ct++;
            return true;
        }
        else if(ct<=k){
            tail.next= temp;
            tail=tail.next;
            ct++;
            return true;
        }
        else{
            tail.next= head;
            return false;
        }
    }
    
    public boolean deQueue() {
        if(head!=null){
            head.val=-1;
            head=head.next;
            ct--;
            return true;
        }
        else  return false;
    }
    
    public int Front() {
        if(head==null) return -1;
          return head.val;
    }
    
    public int Rear() {
        if(tail==null) return -1;
        return tail.val;
    }
    
    public boolean isEmpty() {
        if(head==null) return true;
        return false;
    }
    
    public boolean isFull() {
        if(ct>=k)return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */