import java.util.*;
public class FindTwoNumbersThatAddUpToN {
    public static void main(String [] args){
        
    }


    public static int [] findSumBrute(int [] arr, int n){
        int [] ans = new int[2];
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == n){
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                    return ans;
                }
            }
        }
        return arr;
    }
    public static int [] findSum(int[] arr, int n){
        Map<Integer, Integer> hashmap = new HashMap<>();
        int [] ans = new int [2];
        for(int i = 0; i < arr.length; i++){
            int complement = n - arr[i];
            if(hashmap.containsKey(complement)){
                ans[0] = complement;
                ans[1] = hashmap.get(complement);
                return ans;
            }
            hashmap.put(arr[i], complement);
        }
        return arr;
    }
}
