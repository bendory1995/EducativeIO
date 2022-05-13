import java.util.*;
public class MaximumSumSubarray {
    public static void main(String [] args){

    }

    //brute force solution
    public static int findMaxSumSubArray(int [] arr ){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            int sum = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(sum > maxSum){
                    maxSum = sum;
                }
                sum = sum + arr[j]; 
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static int findMaxSumSubArray2(int [] arr){
        int max = arr[0];
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            sum = Math.max(sum + arr[i], arr[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}
