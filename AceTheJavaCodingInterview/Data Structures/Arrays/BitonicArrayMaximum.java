public class BitonicArrayMaximum{
    public static void main(String [] args){
        
    }

    public static int findMax(int [] arr){
        return binarySearch(arr, 0, arr.length-1);
    }

    //iterative 
    public static int binarySearch(int [] arr, int lo, int hi){
        while (lo < hi){
            int mid = (lo + hi)/2;
            if(arr[mid] < arr[mid+1]){
                lo = mid+1;
            }else{
                hi = mid;
            }
        }
        return arr[lo];
    }

    //recursive

    public static int binarySearch2(int [] arr, int lo, int hi){
        if(lo >= hi) return arr[hi];

        int mid = (lo + hi)/2;
        if(arr[mid] < arr[mid+1]){
            return binarySearch2(arr, mid+1, hi);
        }else{
            return binarySearch2(arr, lo , mid);
        }
    }
}