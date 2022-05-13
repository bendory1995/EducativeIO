public class ImplementBinarySearchSortedArray {
    public static void main(String [] args){
    }

    public static int binarySearchIterative(int [] arr, int target){
        int lo = 0;
        int hi = arr.length-1;

        while(lo <= hi){
            int mid = (lo + hi)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return -1;
    }
    public static int binarySearchRecursive(int [] arr, int target){
        return binarySearch(arr, target, 0, arr.length-1);
    }

    public static int binarySearch(int [] arr, int target, int lo, int hi){
        if(lo > hi){
            return -1;
        }
        int mid = (lo + hi)/2;
        if(arr[mid] == target) return mid;
        else if (arr[mid] < target) return binarySearch(arr, target, mid+1, hi);
        else return binarySearch(arr, target, lo, mid-1);
    }
}
