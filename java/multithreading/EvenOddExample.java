public class EvenOddExample {
    //num for the number upto which the number will be displayed and contr is for counter;
    static int num;
    int contr = 1;

    public void EvenNumberDisplay(){
        synchronized(this){
            while(contr<num){
                while(contr % 2 == 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        //TODO: handle exception
                        e.printStackTrace();
                    }
                }
                System.out.print(contr+" ");
                contr++;
                notify();
            }
        }
    }

    public void OddNumberDisplay(){
        synchronized(this){
            while(contr<num){
                while(contr % 2 ==1){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        //TODO: handle exception
                        e.printStackTrace();
                    }
                }
                System.out.print(contr+" ");
                contr++;
                notify();
            }
        }
    }

    public static void main(String args[]){

        num = 20;
        EvenOddExample oe = new EvenOddExample();
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                oe.EvenNumberDisplay();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run(){
                oe.OddNumberDisplay();
            }
        });

        t1.start();
        t2.start();
    }
}
