// package LinkedList;
// import java.util.LinkedList;

public class basic {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst
    public void addFirst(int data) {
        // step1=creat new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 = newNode next = head
        newNode.next = head; // link

        // step3 = head = newNode
        head = newNode;
    }

    // addLast
    public void addLast(int data) {
        // step-1,create a node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step-2,tail.next=newNode
        tail.next = newNode;

        // step-3, tail=newNode
        tail = newNode;

    }

    // print a LL
    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;

        }
        System.out.println("NuLL");

    }

    // add midle
    public void Madd(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Romove first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0; // size becomes 0
            return val;
        }
        int val = head.data;
        head = head.next;
        size--; // the size becomes --;
        return val;
    }

    // remove last
    public int removeLsat() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // iterative search
    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // reverse Node
    public void reverse() {
        Node prev = null;
        Node curn = tail = head;
        Node next;

        while (curn != null) {
            next = curn.next;
            curn.next = prev;
            prev = curn;
            curn = next;
        }
        head = prev;
    }

    // find and remove Nth from end
    public void findAndRemNthEnd(int n) {
        // find sizs
        Node temp = head;
        int sz = 0;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        // find Nth
        Node prev = head;
        int i = 1;
        int find = sz - n;
        while (i < find) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    //find mid of the ll using slow&fast
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast != null && fast != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    //check ll is palindrome or not
    public boolean checkLLPalindrom(){
if(head == null || head.next == null){
    return true;
}

        //step-1 find mid node
        Node midNode=findMid(head);

        //step-2 reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;

        while (right!=null) {
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;


    }

    // ll is in cycle
    public static boolean isCycle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }





    public static void main(String[] args) {
        Re1 ll = new Re1();
        // ll.print();
        ll.addFirst(2);
        ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addLast(5);
        // ll.Madd(2, 3);
        // ll.print();
        // System.out.println("the size of the ll is "+ll.size);
        // ll.removeFirst();
        // ll.removeLsat();
        // // ll.print();
        // System.out.println( ll.iterativeSearch(1));
        // ll.reverse();
        // System.out.println("aftre reverse ");
        // ll.print();
        // ll.findAndRemNthEnd(1);
        // ll.print();

        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.findMid(head));
        // System.out.println(ll.checkLLPalindrom());

//         head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = head;
//  System.out.println(isCycle(head));

    }
}