public class RearrangeSortedArrayInMaxMinForm {
    public static void main(String [] args){

    }
    public static void maxMin(int [] arr){
        int i = 0; 
        int j = arr.length-1;

        int [] arr2 = new int[arr.length];
        int index = 0;
        boolean leftTurn = false;
        while(i <= j){
            if(leftTurn == false){
                arr2[index] = arr[j];
                index++;
                j--;
                leftTurn = true;
            }else{
                arr2[index] = arr[i];
                index++;
                i++;
                leftTurn = false;
            }
        }

        for(i = 0; i < arr.length; i++){
            arr[i] = arr2[i];
        }
    }
}
