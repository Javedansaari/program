import java.util.Arrays;

public class RemoveWhiteSpace {
    public static void main(String args[]){
        String str = "    hey this is  javed   ansari        ";
        int i;
        
        char[] ch = new char[str.length()];
        for(i=0 ; i<str.length() ; i++){
            ch[i] = str.charAt(i);
            if(i>0 && ch[str.length()-1] != ' ' && ch[i] == ' '   ||  ch[0] == ' ' && i==0){
                ch[i]=ch[i+1];
            }
        }      

        String str1 = String.copyValueOf(ch);
        System.out.println("Before remove white space "+str);
        System.out.println("After removing white space  "+str1);
        System.out.println(str1.length());

    }
}
