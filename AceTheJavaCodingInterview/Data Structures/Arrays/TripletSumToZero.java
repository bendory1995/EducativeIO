import java.util.*;
public class TripletSumToZero {
    public static void main(String [] args){

    }

    public static List<List<Integer>> findTriplets(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < arr.length-2; i++){
            int sum = 0 - arr[i];
            int lo = i + 1;
            int hi = arr.length-1;

            while(lo < hi){
                if(arr[lo] + arr[hi] == sum){
                    result.add(Arrays.asList(arr[i], arr[lo], arr[hi]));
                    while(arr[lo] == arr[lo + 1]) lo++;
                    while(arr[hi] == arr[hi-1]) hi--;
                    lo++;
                    hi--;
                }else if (arr[lo] + arr[hi] > sum){
                    hi--;
                }else{
                    lo++;
                }
            }
        }
        return result;

    }
}
