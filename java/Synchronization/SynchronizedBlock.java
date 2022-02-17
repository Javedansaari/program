class Table{
    void printTable(int num){
        synchronized(this){
            for(int i=1 ; i<=5 ; i++){
                System.out.println(num * i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println(e);
                }
            }
        }
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(3);
    }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(50);
    }
}

public class SynchronizedBlock {
    public static void main(String args[]){
        Table obj = new Table();

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
