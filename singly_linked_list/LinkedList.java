public class LinkedList {  
    public class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
    public static Node tail;
    public static int size;
    // methods for add remove print and search
    public void addFirst(int data){
       
         //step1- create new node
        Node newNode= new Node(data);
         size++;
        if(Head==null){
            Head=tail=newNode;
            return;
        }
        
        //step2 newnode next=head
        newNode.next=Head;
        //step3 head=new node 
        Head= newNode;
    }
    public void deleteFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        }
        else if(size==1){
            Head=tail=null;
            size=0;
            return;
        }
        size--;
        Head=Head.next;
    }

     public void addLast(int data){
       
         //step1- create new node
        Node newNode= new Node(data);
         size++;
        if(Head==null){
            Head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail= newNode;
    }
    public void deleteLast(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        }
        else if(size==1){
            Head=tail=null;
            size=0;
            return;
        }
        size--;
        Node temp=Head;
        for(int i=0;i<size-1;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    public void  printll(){
        if(Head==null){
            System.out.println("LL is null");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
    public void addAnywhere(int idx, int data){
       ;
        if (idx==0){
            addFirst(data);
            return;
        }
         size++;
        Node newNode=new Node(data);
        Node temp=Head;
        int i=0;
        // to track the idx-1 node
        while(i<idx-1){
            temp=temp.next;
            i++;

        }
        // i=idx-1
        newNode.next=temp.next;
        temp.next=newNode;
     
    }
    public void deleteAnywhere(int idx){
        if(idx==0){
            deleteFirst();
            return;
        }
        else if(idx==size-1){
            deleteLast();
            return;
        }
        size--;
        Node temp=Head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // i=idx-1
        temp.next=temp.next.next;
    }

    public static void main(String[] args) {
        LinkedList ll= new LinkedList(); // object of a linked list 
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        //System.out.println(ll);
        ll.printll();
        ll.addAnywhere(2,9);
        System.out.println();
        ll.printll();
        System.out.println("Size is:"+ll.size);
    }
}
