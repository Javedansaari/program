class Sender{
    public void SenderMsg(String msg){
        System.out.println("\nsending a message: "+msg);
        try {
            Thread.sleep(600);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("exception handled "+ e);
        }
        System.out.println("\n "+msg+" : is sent");
    }
}

//creating class for sending message using Thread
class SenderWThread extends Thread{
    private String msg;
    Sender sd;
    
    //method for receiver class
    SenderWThread(String m, Sender obj){
        msg = m;
        sd = obj;
    }

    public void run(){
        sd.SenderMsg(msg);
    }
}

public class SynchronizedBlockSenderMsg {
    public static void main(String args[]){
        Sender sender = new Sender();
        SenderWThread t1 = new SenderWThread("hello there ",sender);
        SenderWThread t2 = new SenderWThread("welcome to synchronized java programme ", sender);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("\n end of the code ");
        }
    }
}
