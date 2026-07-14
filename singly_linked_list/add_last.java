class Node{
    int val;
    Node next;
    Node (int val){
        this.val=val;
        this.next=null;
    }
}

public class add_last {
    public static void last_add(Node head,int value){
        Node last=new Node(value);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=last;
        
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -->");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        
        Node a= new Node(5);
        Node b= new Node(10);
        Node c= new Node(15);
        Node d= new Node(20);
        Node e= new Node(25);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
       last_add(a,30); // head is passed by reference so it will change the original list
        display(a);
}
}