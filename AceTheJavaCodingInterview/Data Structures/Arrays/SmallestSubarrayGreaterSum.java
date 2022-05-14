public class SmallestSubarrayGreaterSum {
    public static void main(String [] args){
        
    }
    public static int findMinSubArray(int s, int [] arr){
        int head = 0;
        int tail = 0;
        int sum = 0;
        int count = 0;
        int minCount = Integer.MAX_VALUE;
        while(head < arr.length){
            while(sum < s){
                sum = sum + arr[head];
                head++;
                count++;
            }
            minCount = Math.min(count, minCount);
            sum = sum - arr[tail];
            tail++;
            count--;
        }
        minCount = Math.min(count, minCount);
        return minCount;
    }
}
