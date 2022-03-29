import java.util.Scanner;

public class SumPowerCombination{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n enter a number    ");
        int input = sc.nextInt();
        
        String str = String.valueOf(input);

        String[] strArray = null;

        strArray = str.split("");

        int size = str.length();
        int[] intArray = new int[size];

        for(int i=0 ; i<str.length() ; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        double sum = 0;
        int firstInteger = intArray[0];
        int lastInteger = intArray[intArray.length-1];

        sum = Math.pow(firstInteger,lastInteger) + Math.pow(lastInteger,intArray[intArray.length-2]);

        for(int i=1 ; i<intArray.length-1 ; i++){
            sum = sum + (int) Math.pow(intArray[i],intArray[i-1]);
        }

        System.out.println(sum);
    }
}