import java.util.*;

public class Subset {
    public static void main(String [] args){
        
    }

    public static List<List<Integer>> findSubsets(int [] nums){
        List<List<Integer>> results = new ArrayList<>();
        Set<List<Integer>> hashset = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();


        //add an empty set to the list
        results.add(new ArrayList<>());

        for(int i = 0; i < nums.length; i++){
            int currentNumber = nums[i];
            int listSize = results.size();

            for(int j = 0; j < listSize; j++){
                List<Integer> curr = new ArrayList<>(results.get(j));
                curr.add(currentNumber);
                results.add(curr);
            }
        }

        for(List<Integer> curr : results){
           hashset.add(curr);
        }
        
        for(List<Integer> curr : hashset){
            ans.add(curr);
        }
        
        return results;
    }
}
