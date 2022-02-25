public class CountNoOfWords {

    static int count=0, i,res;
    static int wordCount(String s){
        char[] ch = new char[s.length()];
        for(i=0 ; i<s.length() ; i++){
            ch[i] = s.charAt(i);
            if((i>0 && ch[i]!=' ' && ch[i-1] == ' ') || (ch[0]!= ' ' && i==0)){
                count++;
            }
        } 
        return count;
    }
    public static void main(String args[]){

        res = CountNoOfWords.wordCount("   hey this is me and I am gonna write a java code");
        System.out.println("\n the number of words present in the string is "+ res);
    
    }
}
