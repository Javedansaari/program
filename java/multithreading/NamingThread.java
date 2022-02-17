class NameThread extends Thread{
    public void run(){
        System.out.println("\nthe thread is executing ");
    }
}

public class NamingThread {
    public static void main(String args[]){
        NameThread obj1 = new NameThread();
        NameThread obj2 = new NameThread();

        System.out.println("\nthread 1 :  "+obj1.getName());
        System.out.println("thread 2 :  "+obj2.getName());

        obj1.start();
        obj2.start();

        obj1.setName("javed ansari");
        System.out.println("\nafter changing the name it becomes  "+ obj1.getName());
    }
    
}
