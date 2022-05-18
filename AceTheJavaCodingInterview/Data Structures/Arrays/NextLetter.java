public class NextLetter {
    public static void main(String [] args){

    }

    public static char searchNextLetter(char[] letters, char key){
        char ans = binarySearch(letters, key, 0, letters.length-1);
        return ans;
    }

    public static char binarySearch(char[] letters, char key, int lo, int hi){
        if(lo > hi) return letters[lo%letters.length];
        
        int mid = (lo + hi)/2;
        if(letters[mid] <= key){
            return binarySearch(letters, key, mid+1, hi);
        }else{
            return binarySearch(letters, key, lo, mid-1);
        }
    }

}
