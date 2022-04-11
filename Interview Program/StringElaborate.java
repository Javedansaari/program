
public class StringElaborate {
    public static void main(String[] args){
        int x=0, i=0;
        String str="5a6b2v9t";

        char[] ch = new char[str.length()];
        for( i = 0 ; i<str.length() ; i++){
            ch[i] = str.charAt(i);
        }
        
        for(int j=0 ; j<ch.length ; j++){
            if(ch[j] >= 'a' && ch[j] <= 'z' || ch[j] >= 'A' && ch[j] <= 'Z')
            continue;
            else{
                x = Character.getNumericValue(ch[j]);
                for(int k=0 ; k<x ; k++){
                    System.out.print(ch[j+1]);
                }
            }
        }
        System.out.println();
    }
}
