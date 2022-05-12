import java.util.*;
public class FindSecondMaximumValue {
    public static void main(String [] args ){
    }

    public static int findSecondMinimum(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static int findSecondMinimum2(int [] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if (arr[i] < max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
