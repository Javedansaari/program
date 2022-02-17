public class Multithread extends Thread{ 
    public 
    void run(){
        System.out.println("\n multithread is executing ");
    }

    public static void main(String args[]){
        Multithread obj = new Multithread();
        obj.start();
    }
}