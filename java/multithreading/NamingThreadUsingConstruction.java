
class NameThread extends Thread{
    NameThread(String nameThread){
        super(nameThread);
    }
    public void run(){
        System.out.println("code is executing");
    }
}

public class NamingThreadUsingConstruction {
    public static void main(String args[]){
        NameThread obj1 = new NameThread("javed");
        NameThread obj2 = new NameThread("ansari");

        System.out.println("first thread is "+obj1.getName());
        System.out.println("second thread is "+ obj2.getName());

        obj1.start();
        obj2.start();
    }
    
}
