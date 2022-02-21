public class CountString {
    public static void main(String args[]){
        String str = "hello there, its me javed ansari and i am a software engineer";

        int count = 0;
        int startWith = 0;

        for(;;){
            int index = str.indexOf('e',startWith);

            if(index >= 0){
                count += 1;
                startWith = index + 1;
            }else{
                break;
            }
        }

        System.out.println("In the given string: "+str);
        System.out.println(" e is repeated "+count+" times");
    }
}