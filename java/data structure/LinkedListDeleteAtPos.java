
public class LinkedListDeleteAtPos {

    //create node
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    //function to push data into linked list
    public void pushElement(int new_data){
        Node new_Node = new Node(new_data);

        //using this operation we push all the element at the front
        new_Node.next = head;
        head = new_Node;
    }

    //create function to delete element at a position
    public void deleteNodeAtPosition(int position){
        
        if(head == null)return;
        
        Node temp = head;
        
        //if position is 0 i.e head itself, we just make next of head as head
        if(position == 0){
            head = temp.next;
            return;
        }

        //first find the previous Node of the Node to be deleted
        for(int i=0 ; temp != null && i <position-1 ; i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null){
            return;
        }

        //node of next of node to be deleted is to be placed into previous node of the node to be deleted
        //create another node in ease the operations
        Node next = temp.next.next;

        temp.next = next;
    }

    //function to print all element of linked list
    public void printData(){
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public static void main(String args[]){
        
        LinkedListDeleteAtPos llist = new LinkedListDeleteAtPos();
        
        llist.pushElement(45);
        llist.pushElement(23);
        llist.pushElement(14);
        llist.pushElement(68);
        llist.pushElement(98);
        llist.pushElement(67);
        llist.pushElement(59);

        llist.printData();

        System.out.println("\n\nafter deleting position it becomes ");
        llist.deleteNodeAtPosition(3);
        llist.printData();
        
        System.out.println();
    }
}
