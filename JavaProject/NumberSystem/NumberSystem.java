import java.util.Scanner;

public class NumberSystem {

    String[] ones={
        "",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine"
    };

    String[] twos={
        "",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen"
    };

    String[] tens={
        "",
        "ten",
        "twenty",
        "thirty",
        "fourty",
        "fifty",
        "sixty",
        "seventy",
        "eighty",
        "ninety"
    };

    String hun = "hundred";
    String thou = "thousand";
    
    public void oneDigitNumb(int x){
        System.out.println(ones[x]);
    }

    public void twoDigitNumb(int x){
        int u = x%10;
        int t = x/10;

        if(u != 0){
            if(t==1){
                System.out.print(twos[u]);
            }else{
                System.out.print(tens[t]+" "+ones[u]);
            }
        }else{
            System.out.print(tens[t]);
        }
    }

    public void threeDigitNumb(int x){
        int h = x/100;
        int i = x%100;

        String len = Integer.toString(i);
        System.out.print(ones[h]+" "+hun+" ");

        if(len.length() == 2){
            System.out.print(" and ");
            twoDigitNumb(i);
        }else{
            System.out.print(" and ");
            oneDigitNumb(i);
        }
    }

    public void fourDigitNumb(int x){
        int th = x/1000;
        int j = x%1000;

        String len = Integer.toString(j);
        System.out.print(ones[th]+" "+thou+" ");

        if(len.length() == 3){
            threeDigitNumb(j);
        }else if(len.length() == 2){
            System.out.print(" and ");
            twoDigitNumb(j);
        }else{
            System.out.print(" and ");
            oneDigitNumb(j);
        }
    }

    public void fiveDigitNumb(int x){
        int tth = x/10000;
        int k = x/1000;
        int l = x%1000;

        String len = Integer.toString(k);
        String len1 = Integer.toString(l);

        twoDigitNumb(k);
        System.out.print(" "+thou+" " );

        if(len1.length() == 3){
            threeDigitNumb(l);
        }else if(len1.length() == 2){
            System.out.print(" and ");
            twoDigitNumb(l);
        }else{
            System.out.print(" and ");
            oneDigitNumb(l);
        }
    }
    public static void main(String args[]){
        NumberSystem obj = new NumberSystem();

        System.out.println("enter a number int integer format upto five digit   ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String number = Integer.toString(num);
        
        if(number.length() == 1){
            obj.oneDigitNumb(num);
        }else if(number.length() == 2){
            obj.twoDigitNumb(num);
        }else if(number.length() == 3){
            obj.threeDigitNumb(num);
        }else if(number.length() == 4){
            obj.fourDigitNumb(num);
        }else if(number.length() == 5){
            obj.fiveDigitNumb(num);
        }else{
            System.out.println("please enter number of five digit   ");
        }

        System.out.println();

    }
}
