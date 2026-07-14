class Node{
    int val;
    Node next;
    Node (int val){
        this.val=val;
        this.next=null;
    }
}





public class ll {

    public static void main(String args[]){
        Node a= new Node(5);
        //a.val=5;
        Node b= new Node(10);
       // b.val=10;
        Node c= new Node(15);
        //c.val=15;
        Node d= new Node(20);
       // d.val=20;
        Node e= new Node(25);
       // e.val=25;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //e.next=null; iski jaurath nahi hai kyuki by default null hota hai
       //all values will be same 
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a.next.next);
        System.out.println(a.next.next.next.val);

    }
    
}
