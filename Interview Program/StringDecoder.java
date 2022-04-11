public class StringDecoder {
    public static void main(String[] args){

        int i=0,x=0;
        String str = "3a7b11d";
        StringBuffer sb = new StringBuffer();

        char[] chArr = str.toCharArray();

        for(i=0 ; i<chArr.length ; i++){

            if(chArr[i] > '0' && chArr[i] <= '9')
                sb.append(chArr[i]);

            else{
                x = Integer.parseInt(sb.toString());
                for(int j=0 ; j<x ; j++)
                    System.out.print(chArr[i]);
                sb.delete(0, sb.length());
            }
        }
        System.out.println();
    }
}
