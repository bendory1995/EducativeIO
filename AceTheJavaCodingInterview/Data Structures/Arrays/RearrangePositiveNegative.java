public class RearrangePositiveNegative {
    public static void main(String [] args){
    }

    public static void reArrange(int [] arr){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
          if(arr[i] < 0){
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            index++;
          }
        }
    }
}
