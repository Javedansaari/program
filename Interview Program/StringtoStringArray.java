
public class StringtoStringArray {
    public static void main(String[] args){

        String str = "javedansari";
        String[] strArray = null;
        String temp = null;

        int numOfElements = str.length() / 3;
        int remainingElements = str.length() % 3;
        int position = 0 , i=0;

        if(remainingElements != 0){
            strArray = new String[numOfElements + 1];
            temp = str.substring(str.length()-remainingElements);
        }else
            strArray = new String[numOfElements];
        
        for(i=0 ; i<numOfElements+1 && position<str.length()-remainingElements ; i++){
            strArray[i] = str.substring(position, position+3);
            position = position+3;
        }
        strArray[i] = temp;

        for(String printElement : strArray)
        System.out.println(printElement);

    }
}
