public class NumberCombinationSum {
    public static void main(String args[]){

        int[] arr = {0,1,2,3,4,5,6,7,8};

        //arr[i] + arr[i+1] +...+arr[n] = 9;
        int twoDigitSum = 0, threeDigitSum = 0, fourDigitSum = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 0)i++;
            for(int j=i+1 ; j>i && j<arr.length ; j++){
                if(arr[j] == 0)j++;
                twoDigitSum = arr[i] + arr[j];

                for(int k=j+1 ; k>j && k<arr.length; k++){
                    if(arr[k] == 0)k++;
                    threeDigitSum = arr[i] + arr[j] + arr[k];

                    for(int l=k+1 ; l>k && l<arr.length ; l++){
                        if(arr[l] == 0)l++;
                        fourDigitSum = arr[i] + arr[j] + arr[k] + arr[l];
                        if(fourDigitSum == 9){
                            System.out.println("sum: " + arr[i]+" + "+arr[j]+" + "+arr[k]+ " + " + arr[l]+ " = 9 ");
                        }
                    }
                    if(threeDigitSum == 9){
                        System.out.println("sum: " + arr[i]+" + "+arr[j]+" + "+arr[k]+ " = 9 ");
                        //continue;
                    }
                }
                if(twoDigitSum == 9){
                    System.out.println("sum: " + arr[i]+" + "+arr[j]+ " = 9 ");
                    //continue;
                }
            }
        }
    }
}
