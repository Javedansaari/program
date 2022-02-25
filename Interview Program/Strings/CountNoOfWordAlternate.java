public class CountNoOfWordAlternate {
    public static void main(String args[]){
        int count=0 , i;
        String str = " hello this is        javed ansari   ";

        for(i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            //word is counted only when str.charAt(i) is not null and str.charAt(i-1) is null.
            //also if char at 0th position is not null then only word is counted.

            if((str.charAt(0) != ' ' && i == 0) || (i>0 && str.charAt(i) != ' ' && str.charAt(i-1) == ' ')){// taking reference of both white space as well as character space
                count++;
            }
            
        }
        System.out.println("\n total number of word in the string is  "+count);
    }
}
