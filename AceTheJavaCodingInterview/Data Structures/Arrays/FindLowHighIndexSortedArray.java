public class FindLowHighIndexSortedArray {
    public static void main(String [] args){
        
    }
    public static int findLowIndex(int [] nums, int target){
        int index = binarySearch(nums, target, 0, nums.length-1);
        if(index == -1) return -1;
        else{
            while(index >=0 && nums[index] == target){
                index--;
            }
            return index+1;
        }
    }

    public static int findHighIndex(int [] nums, int target){
        int index = binarySearch(nums,target, 0, nums.length-1);

        if(index == -1) return -1;
        else{
            while(index < nums.length && nums[index] == target){
                index++;
            }
            return index-1;
        }
    }

    public static int binarySearch(int [] nums, int target, int lo, int hi){
        if(lo > hi) return -1;
        int mid = (lo + hi) /2;

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            return binarySearch(nums, target, mid+1, hi);
        }
        else{
            return binarySearch(nums, target, lo, mid-1);
        }
    }
}
