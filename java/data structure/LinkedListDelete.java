public class LinkedListDelete {
    
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void deleteNode(int key){
        
        Node temp = head, prev_Node = null;
        //if the head node itself is a key
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }

        while(temp != null && temp.data != key){
            prev_Node = temp;
            temp = temp.next;
        }

        if(temp == null)
        return;

        prev_Node.next = temp.next;
    }

    public void pushElement(int new_data){

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
    }

    public static void main(String args[]){
        LinkedListDelete llist = new LinkedListDelete();

        llist.pushElement(4);
        llist.pushElement(32);
        llist.pushElement(13);
        llist.pushElement(85);
        llist.pushElement(54);
        llist.pushElement(9);

        llist.printData();
        System.out.println("after deleting an element");
        llist.deleteNode(54);
        llist.printData();
    }
}
