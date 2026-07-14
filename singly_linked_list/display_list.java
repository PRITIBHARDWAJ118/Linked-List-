class Node{
    int val;
    Node next;
    Node (int val){
        this.val=val;
        this.next=null;
    }
}
public class display_list {
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -->");
            temp=temp.next;
        }
    }
    public static void display_rec(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.val+" -->");
        display_rec(head.next);
    }
    public static void main(String[] args) {
       Node a= new Node(5);
        Node b= new Node(10);
        Node c= new Node(15);
        Node d= new Node(20);
        Node e= new Node(25);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);//pass by reference
    }
    
}
