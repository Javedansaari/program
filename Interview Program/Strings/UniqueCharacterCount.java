public class UniqueCharacterCount {
    public static void main(String args[]){
        int startWith = 0;
        int count;
        int startFrom;

        String str = "hey this is me ";

        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(startWith);
            startFrom = startWith;
            count = 0;
            for(;;){
                int index = str.indexOf(ch,startFrom);

                if(index>=0){
                    count++;
                    startFrom = index + 1 ;
                }else{
                    break;
                }
            }
            if(count == 1){
                System.out.println(ch +" is an unique character ");
                startWith++;
            }else{
                startWith++;
            }

            for(i=0 ; i<startWith ; i++){  //this for loop is to ignore those characters that has already been counted
                if(str.charAt(startWith) == str.charAt(i) || str.charAt(startWith) == ' '){ //ignoring white space
                    startWith++;
                }
            }
        }
    }
}