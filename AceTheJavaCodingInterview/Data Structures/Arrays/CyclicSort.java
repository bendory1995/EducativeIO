public class CyclicSort {
    public static void main(String [] args){
        int [] input = {1, 5, 6, 4, 3, 2};

        cyclicSort(input);
    }

    public static void cyclicSort(int [] nums){
        int i = 0;
        while(i < nums.length){
            int j = nums[i] - 1;

            if(i == j){
                i++;
            }else{
                swap(nums, i, j);
            }
        }
    }
    public static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void printArray(int [] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
