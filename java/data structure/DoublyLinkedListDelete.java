public class DoublyLinkedListDelete {
    
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data)
        {this.data = data;}
    }

    public void insertElement(int newData){

        Node newNode = new Node(newData);
        newNode.data = newData;
        newNode.next = head;

        if(head != null)
            head.prev = newNode;
        head = newNode;
    }

    void printElement(Node temp){

        Node last = null;
        while(temp != null){
            System.out.print(temp.data+" ");
            last = temp;
            temp = temp.next;
        }
    }

    void deleteNode(Node del){

        if(head == null || del == null)
        return;

        if(del == head){
            head = del.next;
        }

        if(del.prev != null)
            del.prev.next = del.next;
        
        if(del.next != null)
            del.next.prev = del.prev;
        
        return;
    }
    public static void main(String[] args){

        DoublyLinkedListDelete dll = new DoublyLinkedListDelete();

        dll.insertElement(21);
        dll.insertElement(43);
        dll.insertElement(76);
        dll.insertElement(98);
        dll.printElement(dll.head);

        dll.deleteNode(dll.head);
        System.out.println();

        dll.printElement(dll.head);
    }
}
