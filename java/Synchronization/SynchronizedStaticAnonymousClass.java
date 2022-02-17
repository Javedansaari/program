class Table{
    synchronized static void printTable(int num){
        for(int i = 1 ; i<=5 ; i++){
            System.out.println(num*i);

            try {
                Thread.sleep(400);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}

public class SynchronizedStaticAnonymousClass {
    public static void main(String args[]){

        Thread t1 = new Thread(){
            public void run(){
                Table.printTable(2);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                Table.printTable(20);
            }
        };

        Thread t3 = new Thread(){
            public void run(){
                Table.printTable(200);
            }
        };

        Thread t4 = new Thread(){
            public void run(){
                Table.printTable(2000);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
