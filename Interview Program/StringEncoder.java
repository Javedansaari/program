public class StringEncoder {
    public static void main(String[] args){
        
        int i=0,j=0, count=1;
        String str = "aabbbc";
        char[] ch = str.toCharArray();

        if(ch.length == 1){
            System.out.print(1+""+ch[0]);
            return;
        }else{
            for(i=0 ; i<ch.length ; i++){

                count = 1;
                for(j=i+1 ; j>i && j<ch.length ; j++){
                    if(ch[i] == ch[j])
                    count++;
                    else
                    break;
                }

                System.out.print(count+""+ch[i]);
                i=j-1;
            }
        }
        System.out.println();
    }
}
