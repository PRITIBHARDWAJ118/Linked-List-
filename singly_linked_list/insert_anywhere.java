
class Node{
    int val;
    Node next;
    Node (int val){
        this.val=val;
        this.next=null;
    }
}
public class insert_anywhere {
    public static void insert(Node head,int position,int value){
        Node temp=head;
        Node newNode=new Node(value);
        for(int i=1;i<position-1;i++){
            //System.out.println(i+" i is ");
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
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
       insert(a,3,30); // head is passed by reference so it will change the original list
       display(a);
    }
}
