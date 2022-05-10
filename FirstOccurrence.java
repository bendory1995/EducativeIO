public class FirstOccurrence {
    public static void main(String [] args){
        
    }

    public static int firstOccurrence(int [] arr, int n, int currentIndex){
        if(currentIndex == arr.length){
            return -1;
        }else if (arr[currentIndex] == n) return currentIndex;
        else{
            return firstOccurrence(arr, n, currentIndex+1);
        }
    }
}
