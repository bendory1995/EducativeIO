public class MoveZerosToLeft {
    public static void main(String [] args){

    }

    public static void moveZerosToLeft(int [] nums){
        int zeroPointer = nums.length-1;
        int numberPointer = nums.length-1;

        while(numberPointer >= 0){
            if(nums[numberPointer] != 0){
                nums[zeroPointer] = nums[numberPointer];
                zeroPointer--;
            }
            numberPointer--;
        }

        while(zeroPointer >= 0){
            nums[zeroPointer] = 0;
            zeroPointer--;
        }
    }
}
