public class CountString {
    public static void main(String args[]){
        String str = "hello there, its me javed ansari and i am a software engineer";

        int count = 0;
        int startWith = 0;

        for(;;){  //empty for loop is used for infinite looping 
            int index = str.indexOf('e',startWith);

            if(index >= 0){
                count += 1;
                startWith = index + 1; //once e is found on certain index, the next startwith should starts with next of the index found. for eg. if 'e' is found on index 1, the loop should continue with index 2 onward.
            }else{
                break;
            }
        }

        System.out.println("In the given string: "+str);
        System.out.println(" e is repeated "+count+" times");
    }
}