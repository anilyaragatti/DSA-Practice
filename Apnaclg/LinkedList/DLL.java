public class DLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

//add first ddl
public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
     if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head.prev=newNode;
    head=newNode;
}

// print a LL
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;

        }
        System.out.println("NuLL");

    }



    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.print();
        
    }
    
}
