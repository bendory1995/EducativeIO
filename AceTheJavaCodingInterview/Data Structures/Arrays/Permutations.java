import java.util.*;
public class Permutations {
    public static void main(String [] args){

    }

    //Iterative
    public static List<List<Integer>> findPermutations(int [] nums){
        List<List<Integer>> result = new ArrayList<>();

       Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(new ArrayList<>());

        for(int curr : nums){
            int n = queue.size();
            for(int i = 0; i < n; i++){
                List<Integer> oldQueue = queue.poll();
                for(int j = 0; j <= oldQueue.size(); j++){
                    List<Integer> newList = new ArrayList<>(oldQueue);
                    newList.add(j, curr);

                    if(newList.size() == nums.length){
                        result.add(newList);
                    }else{
                        queue.add(newList);
                    }
                }
            }
        }
        return result;

    }

    //Recursive
    public static List<List<Integer>> findPermutations2(int [] nums){
        List<List<Integer>> result = new ArrayList<>();

        recursivePermutation(nums, 0, new ArrayList<Integer>(), result);
        return result;
    }

    public static void recursivePermutation(int [] nums, int index, List<Integer> currentPermutation, List<List<Integer>> result){
        if(nums.length == index){
            result.add(currentPermutation);
        }else{
            for(int i = 0; i <= currentPermutation.size(); i++){
                List<Integer> oldPermutation = new ArrayList<>(currentPermutation);
                oldPermutation.add(i, nums[index]);
                recursivePermutation(nums, index+1, oldPermutation, result);
            }
        }

    }

}
