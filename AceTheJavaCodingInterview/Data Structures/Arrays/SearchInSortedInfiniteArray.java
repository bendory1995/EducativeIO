import java.util.*;
public class SearchInSortedInfiniteArray {
    public static void main(String [] args){

    }
    class ArrayReader {
        int[] arr;
      
        ArrayReader(int[] arr) {
          this.arr = arr;
        }
      
        public int get(int index) {
          if (index >= arr.length)
            return Integer.MAX_VALUE;
          return arr[index];
        }
      }

    public static int search(ArrayReader reader, int key){
        int i = 1;

        while(reader.get(i) < key){
            i = i*2;
        }

        return binarySearch(reader, key, 0, i);
    }

    public static int binarySearch(ArrayReader reader, int key, int lo, int hi){
        if (lo > hi) return -1;

        int mid = (lo + hi)/2;
        if(reader.get(mid) == key) return mid;
        else if(reader.get(mid) < key){
            return binarySearch(reader, key, mid+1, hi);
        }else{
            return binarySearch(reader, key, lo, mid-1);
        }
    }


}
