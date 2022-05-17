import java.util.*;
public class TripletsWithSmallerSum{
    public static void main(String [] args){

    }

    public static int searchTriplets(int [] arr, int target){
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < arr.length-2; i++){
            int lo = i +1;
            int hi = arr.length-1;

            while(lo < hi){
                System.out.println("current Numbers: " + arr[i] + "," + arr[lo] + "," +arr[hi]);
                if(arr[i] + arr[lo] + arr[hi] < target){
                    System.out.println("COUNT++ LO++");
                    count = count + hi-lo;
                    lo++;
                }else{
                    hi--;
                }
            }
        }
        return count;
    }
}