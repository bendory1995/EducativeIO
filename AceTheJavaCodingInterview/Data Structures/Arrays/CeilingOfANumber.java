import java.util.*;
public class CeilingOfANumber {
    public static void main(String [] args){

    }
    public static int searchCeiling(int [] arr, int key){
        if(key > arr[arr.length-1]) return -1;
        int ans = binarySearch(arr, key, 0, arr.length-1);
        return ans;
    }
    
    public static int binarySearch(int [] arr, int key, int lo, int hi){
        if(lo > hi) return lo;
        int mid = (lo + hi)/2;

        if(arr[mid] == key){
            return mid;
        }else if(arr[mid] < key){
            return binarySearch(arr, key, mid+1, hi);
        }else{
            return binarySearch(arr, key, lo, mid-1);
        }
    }
}
