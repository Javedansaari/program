public class VowelCount {
    public static void main(String args[]){
        int count=0;
        String str = "My name is Javed Ansari and I am a software Engineer ";

        char[] vowel = {'a','e','i','u','A','E','I','O','U'};

        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);

            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }
        System.out.println("In the given string: "+str);
        System.out.println("the total number of vowel is "+count);
    }
}
