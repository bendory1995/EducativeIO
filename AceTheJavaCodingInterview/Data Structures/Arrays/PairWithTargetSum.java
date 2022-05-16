import java.util.*;
public class PairWithTargetSum {
    public static void main(String [] args){

    }

    public static int [] search(int [] arr, int targetSum){
        Map<Integer, Integer> hashmap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int complement = targetSum - arr[i];

            if(!hashmap.containsKey(complement)){
                hashmap.put(arr[i], i);
            }else{
                return new int [] {hashmap.get(complement), i};
            }
        }
        return new int [] {-1, -1};
    }
}
