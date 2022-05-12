public class ArraysOfProductsOfAllElementsExceptItself {
    public static void main(String [] args){

    }
    public static int [] findProduct(int arr[]){
        int [] ans = new int[arr.length];
        int temp = 1;
        for(int i = 0; i < arr.length; i++){
            ans[i] = temp;
            temp = temp * arr[i];
        }
        temp = 1;
        for(int j = arr.length-1; j >= 0; j--){
            ans[j] = ans[j] * temp;
            temp = arr[j]* temp;
        }
        return ans;
    }
}
