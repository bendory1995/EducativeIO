public class MaximumSumSubarraySizeK {
    public static void main(String [] args){

    }
    public static int findMaxSumSubarray(int k, int [] arr){
        if(arr.length < k) return -1;

        int sum = 0;
        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        int maxSum = sum;
        int index = 0;
        for(int i = k; i < arr.length; i++){
            sum = sum - arr[index] + arr[i];
            maxSum = Math.max(sum , maxSum);
            index++;
        }
        return maxSum;
    }
}
