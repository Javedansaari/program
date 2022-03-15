public class NumberCombinationSum {
    public static void main(String args[]){

        int[] arr = {0,1,2,3,4,5,6,7,2,8,3,9};
        int sumOfInteger = 9;
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
                        if(fourDigitSum == sumOfInteger){
                            System.out.println("sum: " + arr[i]+" + "+arr[j]+" + "+arr[k]+ " + " + arr[l]+ " = " +sumOfInteger);
                        }
                    }
                    if(threeDigitSum == sumOfInteger){
                        System.out.println("sum: " + arr[i]+" + "+arr[j]+" + "+arr[k]+ " = "+sumOfInteger);
                    }
                }
                if(twoDigitSum == sumOfInteger){
                    System.out.println("sum: " + arr[i]+" + "+arr[j]+ " = "+sumOfInteger);
                }
            }
        }
    }
}
