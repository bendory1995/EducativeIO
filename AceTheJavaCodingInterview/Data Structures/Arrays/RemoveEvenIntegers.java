import java.util.*;
public class RemoveEvenIntegers{
    public static void main(String [] args){

    }

    public static int [] removeEven(int[] arr){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] %2 != 0){
				count++;
			}
		}
		int [] ans = new int[count];
		int j = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]%2 != 0){
				ans[j] = arr[i];
				j++;
			}
		}
		return ans;
    }
}