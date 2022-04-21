public class DoublyLinkedListInsertion {

    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int d){
            data = d;
        }
    }

    //pushing data elements in front of the node
    public void pushElement(int newData){
        
        Node newNode = new Node(newData);

        newNode.next = head;
        newNode.prev = null;

        if(head != null)
            head.prev = newNode;
        head = newNode;
    }

    //pushing element before a given node say nextNode here. 
    //taking reference as nextNode to push data infront of it.
    public void insertBeforeNode(Node nextNode , int newData){

        //check if next node is null
        if(nextNode == null){
            System.out.println("the given next cannot be null");
            return;
        }

        Node newNode = new Node(newData);

        newNode.prev = nextNode.prev;
        nextNode.prev = newNode;
        newNode.next = nextNode;

        //check whether the newNode is head
        if(nextNode.prev == null)
        head = newNode;
        else
        newNode.prev.next = newNode;
    }

    //function to insert element after a given node
    //we take reference as previous node here
    public void insertAfterNode(Node prevNode, int newData){

        if(prevNode == null){
            System.out.println("the previous node cannot be null");
            return;
        }

        Node newNode = new Node(newData);

        newNode.prev = prevNode;
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        //checking if the given prevNode is the last node or not
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }
    }

    //function to insert element at last
    public void append(int newData){

        Node newNode = new Node(newData);
        Node tail = head;

        newNode.next = null;

        if(head == null){

            newNode.prev = null;
            head = newNode;

        }else{

            while(tail.next != null)
            tail = tail.next;

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //function to print all data elements in forward direction
    public void printElement(Node node){
        Node last = null;
        while(node != null){
            System.out.print(node.data+" ");
            last = node;
            node = node.next;
        }
    }

    public static void main(String args[]){
        
        DoublyLinkedListInsertion dll = new DoublyLinkedListInsertion();

        dll.pushElement(32);
        dll.pushElement(53);
        dll.pushElement(87);
        dll.insertAfterNode(dll.head, 19);
        dll.pushElement(63);
        dll.insertBeforeNode(dll.head.next.next, 118);

        dll.printElement(dll.head);
        System.out.println();
    }
}
