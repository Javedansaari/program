public class MultipleTryCatchBlockExample {
    public static void main(String args[]){
        try {
            int arr[] = {2,4,9,5};
            System.out.println(arr[8]);
            arr[5] = 20/0;
        } catch (ArithmeticException e) {
            System.out.println("arithemtic exception is used ");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bounds exception will be executed ");
        } catch(Exception e){
            System.out.println("parent exception will be executed ");
        }
        System.out.println("rest of the code ");
    }
}
