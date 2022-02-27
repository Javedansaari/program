public class RemoveWhiteSpaceAlternate {
    
    static int i;
    static void shrinkString(String str){
        for(i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                System.out.println(ch);
            }
        }
    }

    public static void main(String args[]){
        String str1 = "hey there my name is javed       ";

        System.out.println("\nbefore shrinking the string is " + str1);
        System.out.println("after shrinking  ");
        RemoveWhiteSpaceAlternate.shrinkString(str1);
    }
}
