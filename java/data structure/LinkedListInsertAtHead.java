
public class LinkedListInsertAtHead {
    
    Node head;
    static class Node{
        
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void push(int new_data){
        
        Node new_Node = new Node(new_data);

        new_Node.next = head;
        head = new_Node;
    }

    public void printData(){
        Node n = head;
        while(n != null){
            System.out.print(n.data +" ");
            n = n.next;
        }
        System.out.println();
    }
    public static void main(String args[]){

        LinkedListInsertAtHead llist = new LinkedListInsertAtHead();

        llist.head = new Node(21);
        Node q1 = new Node(12);
        Node q2 = new Node(45);
        Node q3 = new Node(33);

        llist.head.next = q1;
        q1.next = q2;
        q2.next = q3;

        llist.printData();

        System.out.println("after inserting another node at the head ");
        llist.push(99);
        llist.printData();

    }
}
