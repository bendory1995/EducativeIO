public class RightRotateTheArrayByOneIndex {
    public static void main(String [] args){

    }
    public static void rotateArray(int[] arr){
        int lastNum = arr[arr.length-1];

        for(int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastNum;
    }
}
