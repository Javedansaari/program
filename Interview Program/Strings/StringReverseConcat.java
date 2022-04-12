
public class StringReverseConcat {
    public static void main(String[] args){

        String str = "abc";
        String str1 = "wxabcyz";
        StringBuffer sb = new StringBuffer();

        int i = 0;

        System.out.println("first string is : "+str);
        System.out.println("\nsecond string is : "+str1);
        System.out.println("\nthe required string is : ");
        for(i=0 ;  i<str.length() ; i++){
            str1 = str1.replaceAll(String.valueOf(str.charAt(i)),"");
        }
        
        System.out.print("\n"+sb.append(str.concat(str1)).reverse().toString());
        
        System.out.println();
    }
}
