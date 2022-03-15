public class LinkedListInsertAtPos {
    
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void insertAtPos(Node prev_Node, int new_data){

        if(prev_Node == null){
            System.out.println("\n the previous node cannot be null");
        }else{
            Node new_Node = new Node(new_data);

            new_Node.next = prev_Node.next;
            prev_Node.next = new_Node;
        }
        System.out.println();
    }

    public void printData(){
        Node n = head;
        while(n != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    public static void main(String args[]){
        LinkedListInsertAtPos llist = new LinkedListInsertAtPos();

        llist.head = new Node(31);
        Node q1 = new Node(24);
        Node q2 = new Node(89);
        Node q3 = new Node(57);

        llist.head.next = q1;
        q1.next = q2;
        q2.next = q3;

        llist.printData();

        System.out.println("after inserting an element at a position ");
        llist.insertAtPos(q1, 49);
        llist.printData();
    }
}
