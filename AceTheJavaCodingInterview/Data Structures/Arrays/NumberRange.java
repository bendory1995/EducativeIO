public class NumberRange {
    public static void main(String [] args){

    }
    public static int[] findRange(int [] arr, int key){
        int lowIndex = binarySearch(arr, key, 0, arr.length-1, false);
        int highIndex = binarySearch(arr, key, 0, arr.length-1, true);

        return new int []{lowIndex, highIndex};
    }

    public static int binarySearch(int [] arr, int key, int lo, int hi, boolean findMax){
        int retVal = -1;

        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(arr[mid] > key){
                hi = mid-1;
            }else if (arr[mid] < key){
                lo = mid+1;
            }else{
                retVal = mid;
                if(findMax){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
        }
        return retVal;
    }
    
}
