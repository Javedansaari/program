//import java.lang.getPriority();

public class ThreadSetPriority extends Thread {
    public void run(){
        System.out.println("\n the thread is executing");
    }

    public static void main(String args[]){
        ThreadSetPriority obj1 = new ThreadSetPriority();
        ThreadSetPriority obj2 = new ThreadSetPriority();
        ThreadSetPriority obj3 = new ThreadSetPriority();

        System.out.println("the priority of first thread is "+obj1.getPriority());
        System.out.println("the priority of second thread is "+obj2.getPriority());
        System.out.println("the priority of third thread is "+obj3.getPriority());

        obj1.setPriority(3);
        obj2.setPriority(6);
        obj3.setPriority(9);

        System.out.println("\nthe new priority of first thread is "+obj1.getPriority());
        System.out.println("the new priority of second thread is "+obj2.getPriority());
        System.out.println("the new priority of third thread is "+obj3.getPriority());

        System.out.println("\n display the current executing thread is: "+ Thread.currentThread().getName());
        System.out.println("\n display the priority of current executing thread is: "+ Thread.currentThread().getPriority());

    }
}
