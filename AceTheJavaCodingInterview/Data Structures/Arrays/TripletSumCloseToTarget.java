import java.util.*;
public class TripletSumCloseToTarget {
    public static void main(String [] args){

    }
    public static int searchTriplet(int [] arr, int targetSum){
        Arrays.sort(arr);
        
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length-2; i++){
            int lo = i +1;
            int hi = arr.length-1;

            while(lo < hi){
                int diff = targetSum - arr[i] - arr[lo] - arr[hi];
                
                if(diff == 0) return targetSum;

                if(Math.abs(diff) < Math.abs(smallest)
                || Math.abs(diff) == Math.abs(smallest) && diff > smallest){
                    smallest = diff;
                }
                if(diff > 0) lo++;
                else hi--;
            }
        }
        return targetSum - smallest;
    }
}
