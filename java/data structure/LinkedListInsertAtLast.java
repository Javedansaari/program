public class LinkedListInsertAtLast {
    
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void insertAtEnd(int new_data){
        
        Node new_Node = new Node(new_data);
        if(head == null){
            head = new_Node;
            return;
        }else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_Node;
            new_Node.next = null;
            return;
        }
    }

    public void printData(){
        Node n = head;
        while(n != null){
            System.out.print(n.next+" ");
            n = n.next;
        }
    }

    public static void main(String args[]){
        LinkedListInsertAtLast llist = new LinkedListInsertAtLast();

        llist.head = new Node(42);
        Node q1 = new Node(13);
        Node q2 = new Node(98);
        Node q3 = new Node(67);

        llist.head.next = q1;
        q1.next = q2;
        q2.next = q3;

        llist.printData();
        System.out.println();
        
    }
}
