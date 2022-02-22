public class CountTotalCharacter {
    public static void main(String args[]){
        int startWith = 0;
        int startFrom,count,i,j;

        String str = "my name is javed ansari";

        for(i=0 ; i<str.length() ; i++){ // this for loop is to identify the character in the string
            char str1 = str.charAt(startWith);
            
            startFrom = startWith;
            count = 0;
            for(;;){  // this for loop is to count the number of characters present
                int index = str.indexOf(str1,startFrom);
                if(index >= 0){
                    count += 1;
                    startFrom = index + 1;
                }else{
                    break;
                }
            }
            System.out.println(str1 +" has repeated for "+ count +" times.");
            startWith++;

            for(j=0 ; j<startWith ; j++){  //this for loop is to ignore those characters that has already been counted
                if(str.charAt(startWith) == str.charAt(j) || str.charAt(startWith) == ' '){ //ignoring white space
                    startWith++;
                }
            }
        }    
    }
}
