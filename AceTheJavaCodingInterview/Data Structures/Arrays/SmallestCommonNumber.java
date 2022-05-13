import java.util.*;
public class SmallestCommonNumber {
    public static void main(String [] args){

    }

    public static Integer findLeastCommonNumber(int [] arr1, int [] arr2, int [] arr3){
        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length && k < arr3.length){
            //The first number will be the smallest. 
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                return arr1[i];
            }

            //ONLY increment when both numbers are bigger. 
            if(arr2[j] < arr1[i] && arr2[j] < arr3[k]){
                j++;
            }else if (arr3[k] < arr1[i] && arr3[k] <arr2[j]){
                k++;
            }else{
                i++;
            }
        }
        return -1;
    }
}
