public class InvertPositions {
    public static void main(String[] args){
        int [] arr = {7,6,5,4,3,2,1};
        // char [] arr2 = {'a', 'b', 'c', 'd'};
        invert(arr, 0);
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        // System.out.println(arr2);
    }

    public static void invert(int [] array, int currentIndex){
        if(currentIndex < (array.length-1)/2){
            swap(array, currentIndex, array.length-1-currentIndex);
            invert(array, currentIndex+1);
        }
    }
    public static void swap(int [] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
