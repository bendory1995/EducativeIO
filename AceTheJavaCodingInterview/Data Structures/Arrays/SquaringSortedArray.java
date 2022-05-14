public class SquaringSortedArray {
    public static void main(String [] args){

    }
    public static int[] makeSquares(int [] arr){
        int leftPointer = 0;
        int rightPointer = arr.length-1;
        int index = arr.length-1;
        
        int [] squares = new int[arr.length];
        while(leftPointer < rightPointer){
            int leftSquare = arr[leftPointer] * arr[leftPointer];
            int rightSquare = arr[rightPointer] * arr[rightPointer];

            if(leftSquare >= rightSquare){
                squares[index] = leftSquare;
                leftPointer++;
                index--;
            }else{
                squares[index] = rightSquare;
                rightPointer--;
                index--;
            }
        }
        return squares;
    }



}
