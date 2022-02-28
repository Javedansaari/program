import java.util.Scanner;

public class NumbersToWords{
    public static void main(String args[]){
        String[] ones = {
            "",
            " One ",
            " Two ",
            " Three ",
            " Four ",
            " Five ",
            " Six ",
            " Seven ",
            " Eight ",
            " Nine ",
            " Ten ",
            " Eleven ",
            " Twelve ",
            " Thirteen ",
            " Fourteen ",
            " Fifteen ",
            " Sixteen ",
            " Seventeen ",
            " Eighteen ",
            " Nineteen ",

        };

        

        String[] tens = {
            "",
            " ten ",
            " Twenty ",
            " Thirty ",
            " Fourty ",
            " Fifty ",
            " Sixty ",
            " Seventy ",
            " Eighty ",
            " Ninety ",
        };
        String hun = " Hundred ";
        String th = " Thousand ";

        System.out.println("\n please enter a number upto 4 digit ");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        //String x = "0946";
        if(x.charAt(0) == '0'){
            x.replace("0","");
        }

        int n = Integer.parseInt(x);
        System.out.println(n);
        String str = Integer.toString(n);

        if(str.length() == 1){
            int u = n%10;    // to check one digit number

            System.out.println(ones[n]);

        }

        if(str.length() == 2){
            if(n<20){
                System.out.println(ones[n]);  
            }else{
                int u = n%10;   // to check one digit number
                int tt = n/10;
                int t = tt%10;  // to check two digit number

                System.out.println(tens[t] + ones[u]);
            }
            

        }
        
        if(str.length() == 3){
            int u = n%10;   // to check one digit number
            int tt = n/10;
            int t = tt%10;  // to check two digit number
            int h = n/100;  //to check three digit number 

            System.out.println(ones[h]+ hun + tens[t] + ones[u]);

        }

        if(str.length() == 4){
            
            //int h = n/100;  //to check three digit number
            int tho = n/1000;
            int tho1 = n%1000;
            int h = tho1/100;
            int tt = n/10;
            int t = tt%10;  // to check two digit number
            int u = n%10;   // to check one digit number

            System.out.println(ones[tho]+ th + ones[h]+ hun + tens[t] + ones[u]);


        }
    }

}