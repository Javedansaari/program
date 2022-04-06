import java.util.Scanner;

public class swapStringExample {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = "javedansarixy";
        String temp = null;
        String temp1 = null;
        String[] strArray = null;

        //System.out.println("enter a string value   ");
        //str = sc.next();

        int noOfSpace = str.length()/2;
        int remainingElement = str.length()%4;
        int i=0;
        int position = 0;

        if(remainingElement == 1)
        strArray = new String[noOfSpace+1];
        else
        strArray = new String[noOfSpace];

        if(remainingElement != 0)
            temp = str.substring(str.length()-remainingElement);

        for(i=0 ; i<noOfSpace+1 && position < str.length()-remainingElement; i++){
            strArray[i] = str.substring(position,position+2);
            position = position + 2;
        }

        for(i=0 ; i<noOfSpace-1 ; i++){
            temp1 = strArray[i];
            strArray[i] = strArray[i+1];
            strArray[i+1] = temp1;

            i++;
        }

        if(temp != null)
        strArray[i] = temp;

        for(String printElement : strArray)
        System.out.print(printElement+" ");
    }
}
