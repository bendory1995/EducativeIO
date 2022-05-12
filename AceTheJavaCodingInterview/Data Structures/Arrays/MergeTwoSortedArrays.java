public class MergeTwoSortedArrays {
    public static void main(String[] args){
        //create an array with the proper size.
        
        //then add arr1 and arr2 items.

        // There should be another implementation copy() or merge() ?? 
    }

    public static int [] mergeArrays(int [] arr1, int [] arr2){
        int [] ans = new int[arr1.length + arr2.length];
        int ansIndex = 0;
        int i = 0;
        int j = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[ansIndex] = arr1[i];
                ansIndex++;
                i++;
            }
            else{
                ans[ansIndex] = arr2[j];
                ansIndex++;
                j++;
            }
        }

        while(i < arr1.length){
            ans[ansIndex] = arr1[i];
            ansIndex++;
            i++;
        }
        
        while(j < arr2.length){
            ans[ansIndex] = arr2[j];
            ansIndex++;
            j++;
        }
        return ans;
    }
}
