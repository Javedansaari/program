public class StringtoStringArrayAlternate {
    public static void main(String[] args){

        String str = "javedansari";
        String[] strArray = null;
        String[] secStringArray = null;

        int numOfElements = str.length()/3;
        int remainingElements = str.length()%3;
        int i=0, position = 0;
        String temp = null;

        if(remainingElements != 0){
            temp = str.substring(str.length()-remainingElements);
        }

        strArray = str.split("");

        for(i=0 ; i<numOfElements+1 && position <str.length()-remainingElements ; i++){
            secStringArray[i] = strArray.su
        }
    }
}
