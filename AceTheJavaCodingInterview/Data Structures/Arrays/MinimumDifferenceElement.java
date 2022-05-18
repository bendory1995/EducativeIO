public class MinimumDifferenceElement {
    public static void main(String [] args){

    }

    public static int searchMinDiffElement(int [] arr, int key){
        if(arr[0] > key) return arr[0];
        if(arr[arr.length-1] < key) return arr[arr.length-1];
        return binarySearch(arr, key, 0, arr.length-1);
    }

    public static int binarySearch(int [] arr, int key, int lo, int hi){
        if(lo > hi && lo >= 0 && hi >= 0 && lo < arr.length && hi < arr.length){
            if(Math.abs(key - arr[lo]) < Math.abs(key - arr[hi])){
                return arr[lo];
            }else{
                return arr[hi];
            }
        }
        int mid = (lo + hi)/2;

        if(arr[mid] > key){
            return binarySearch(arr, key, lo, mid-1);
        }else if (arr[mid] < key){
            return binarySearch(arr, key, mid+1, hi);
        }else{
            return arr[mid];
        }
    }
}
