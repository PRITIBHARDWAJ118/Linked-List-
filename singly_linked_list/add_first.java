class Node{
    int val;
    Node next;
    Node (int val){
        this.val=val;
        this.next=null;
    }
}

public class add_first {
    public static Node first_add(Node head,int value){
        
        Node first=new Node(value);
        first.next=head;
        return first;
       // head=first; this deoes not work because head is a local variable and it will not change the original head in main method
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
       
        a=first_add(a,1); // new head is returned and assigned to a
        display(a);
    }
    
}
