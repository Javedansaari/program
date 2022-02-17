class Table{
    synchronized void printTable(int num){
        for(int i=1 ; i<=5 ; i++){
            System.out.println(num*i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
            }
        }
    }
}

public class SynchronizedMethodAnonymousClass {
    public static void main(String args[]){
        final Table obj = new Table();

        Thread t1 = new Thread(){
            public void run(){
                obj.printTable(6);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                obj.printTable(200);
            }
        };
        t1.start();
        t2.start();
    }
}
