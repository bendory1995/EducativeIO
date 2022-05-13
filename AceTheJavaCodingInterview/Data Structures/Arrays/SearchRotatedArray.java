public class SearchRotatedArray {
    public static void main(String [] args){

    }
    public static int binarySearchRotated(int [] nums, int target){
        return binarySearch(nums, target, 0, nums.length-1);
    }

    public static int binarySearch(int [] nums, int target, int lo, int hi){
        if(lo > hi) return -1;
        int mid = (lo + hi)/2;
        if(nums[mid] == target) return mid;
        
        //start to mid is sorted 
        if(nums[lo] < nums[mid]){
            if(target >= nums[lo] && target <= nums[mid]){
                return binarySearch(nums, target, lo, mid-1);
            }else{
                return binarySearch(nums, target, mid+1, hi);
            }
        }
        else{
            if(target <= nums[hi] && target >= nums[mid]){
                return binarySearch(nums, target, mid+1, hi);
            }else{
                return binarySearch(nums, target, lo, mid-1);
            }
        }
    }
}
