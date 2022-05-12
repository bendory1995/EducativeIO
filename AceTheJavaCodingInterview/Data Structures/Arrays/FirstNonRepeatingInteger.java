import java.util.*;
public class FirstNonRepeatingInteger {
    public static void main(String [] args){

    }

    public static int findFirstUnique(int [] arr){
        Map<Integer, Integer> hm =  new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            //if the number exists, add 1 
            if(hm.containsKey(arr[i])){
                int numToPut = hm.get(arr[i]) + 1;
                hm.put(arr[i], numToPut);
            }else{
                hm.put(arr[i], 1);
            }
            //else add the number to the map
        }

        for(int i = 0; i < arr.length; i++){
            if(hm.get(arr[i]) == 1){
                return arr[i];
            }
        }

        return -1;

    }
}
