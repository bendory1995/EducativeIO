public class FindMinimumValueInAnArray {
    public static void main(String [] args){

    }
    public static int findMinimum(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
          if(min > arr[i]){
            min = arr[i];
          }
        }
        return min;
    }
}
