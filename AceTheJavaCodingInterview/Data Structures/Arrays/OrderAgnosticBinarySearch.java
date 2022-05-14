public class OrderAgnosticBinarySearch {
    public static void main(String [] args){

    }
    public static int search(int [] arr, int key){
        int lo = 0;
        int hi = arr.length-1;
        if(arr[lo] < arr[hi]){
            return binarySearch(arr, lo, hi, key);
        }else{
            return binarySearch2(arr,lo, hi, key);
        }
    }
    public static int binarySearch(int [] arr, int lo, int hi, int key){
        if(lo > hi) return -1;
        int mid = (lo + hi)/2;

        if(arr[mid] == key) return mid;
        else if(arr[mid] < key){
            return binarySearch(arr, mid+1, hi, key);
        }else{
            return binarySearch(arr, lo, mid-1, key);
        }
    }

    public static int binarySearch2(int [] arr, int lo, int hi, int key){
        if(lo > hi) return -1;
        int mid = (lo+hi)/2;

        if(arr[mid] == key) return mid;
        else if (arr[mid] < key){
            return binarySearch(arr, lo, mid-1, key);
        }else{
            return binarySearch(arr, mid+1, hi, key);
        }
    }
}
