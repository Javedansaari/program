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

    public void append(int new_data){
        
        Node new_Node = new Node(new_data);
        if(head == null){
            head = new Node(new_data);
            return;
        }
        new_Node.next = null;

        Node last = head;
        while(last.next != null)
            last = last.next;
            
        last.next = new_Node;
        return;
    }

    public void printData(){
        Node n = head;
        while(n != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    public static void main(String args[]){
        LinkedListInsertAtLast llist = new LinkedListInsertAtLast();

        llist.head = new Node(42);
        llist.append(32);
        llist.append(59);

        llist.printData();
        System.out.println();
        
    }
}
