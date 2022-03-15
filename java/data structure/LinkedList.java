class LinkedList{
    Node head;

    //this inner class is made static so that main method can access it
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    //this function starts printing data of the nodes starting from head
    public void printData(){
        Node n = head;

        while(n != null){
            System.out.println(n.data +" ");
            n = n.next;
        }
    }

    public static void main(String args[]){
        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(4);

        llist.head.next = second;
        second.next = third;

        llist.printData();
    }
}