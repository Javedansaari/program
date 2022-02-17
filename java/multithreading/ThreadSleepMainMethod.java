public class ThreadSleepMainMethod {
    public static void main(String args[]){
        try {
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}

