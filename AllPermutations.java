public class AllPermutations {
    public static void main(String[] args){
        char []  array = {'a', 'b', 'c','d'};
        printAllPermutations(array, 4);
    }
    public static void printAllPermutations(char[] array, int length){
        if(length == 1) System.out.println(array);
        for(int i = 0; i < length; i++){
            //try
            swap(array, i, length-1);
            printAllPermutations(array, length-1);
            //backtrack
            swap(array, i, length-1);
        }
    }
    

    public static void swap(char [] array, int i, int j){
        char c = array[i];
        array[i] = array[j];
        array[j] = c;
    }
}
