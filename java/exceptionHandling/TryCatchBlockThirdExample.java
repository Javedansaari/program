public class TryCatchBlockThirdExample {
    public static void main(String args[]){
        try {
            int data = 20/0;
        } catch (ArrayIndexOutOfBoundsException e) {    //ArrayIndexOutOfBoundException cannot handle ArithmeticException...
            //TODO: handle exception
            System.out.println(e);
        }
        System.out.println("rest of the code ");
    }
}
