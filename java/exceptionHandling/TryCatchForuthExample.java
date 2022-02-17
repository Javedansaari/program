public class TryCatchForuthExample {
    public static void main(String args[]){
        try {
            int arr[]={1,3,4,7};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        System.out.println("\n rest of the code");
    }
}
