import java.util.*;
public class SubarrayProductLessThanK {
    public static void main(String [] args){

    }
    public static int findSubarrays(int [] arr, int target){
        int count = 0;
        int left = 0;
        int product = 1;
        for(int right = 0; right < arr.length; right++){
            product = product * arr[right];
            while(product >= target) product = product / arr[left++];
            count = count + right - left + 1;
        }
        return count;
    }
    
}
