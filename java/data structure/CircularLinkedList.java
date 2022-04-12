public class CircularLinkedList {

    static class Node{
        int data;
        Node next;
    };

    //creating a function that insert nodes into it
    static Node push(Node head, int data){

        Node ptr = new Node();
        Node temp = head;
        ptr.data = data;
        ptr.next = head;

            if(head != null){
                while(temp.next != head)
                temp = temp.next;

                temp.next = ptr;
            }else
                ptr.next = ptr;
            
            head = ptr;
            return head;
            
    }

    //function to display elements
    static void printElement(Node head){
        Node n = head;
        if(head != null){
            do{
                System.out.print(n.data+" ");
                n = n.next;
            }while(n != head);
        }
    }

    public static void main(String[] args){
        Node head = null;

        head = push(head, 12);
        head = push(head, 32);
        head = push(head, 43);
        head = push(head, 76);

        System.out.println("the content of circular linked list are  \n");
        printElement(head);
    }
}
