public class DoublyLinkedList {

    //creating a doubly linked list node
    Node head;
    Node tail;
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int d){
            data = d;
            prev = null;
            next = null;
        }
    }

    //creating a function to push element
    public void pushData(int data){
        Node newNode = new Node(data);

        newNode.next = head;

        if(head != null)
            head.prev = newNode;
        head = newNode;
 
    }

    //function to display elements
    void displayElements(){
        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp != null);
    }

    //functoin to display elements in reverse order using prev node
    void displayElementReverseOrder(){
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        do{
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }while(temp != head);
        System.out.print(temp.data);
    }

    public static void main(String[] args){

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.pushData(32);
        dll.pushData(31);
        dll.pushData(19);
        dll.pushData(45);
        dll.pushData(65);

        dll.displayElements();
        System.out.println();
        dll.displayElementReverseOrder();

        System.out.println();
    }    
}
