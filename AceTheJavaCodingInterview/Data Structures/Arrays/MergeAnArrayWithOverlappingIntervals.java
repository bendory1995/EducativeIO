import java.util.*;
public class MergeAnArrayWithOverlappingIntervals {
    public static void main(String [] args){

    }
    class Pair {
        public int first;
        public int second;
    
        public Pair(int x, int y) {
            this.first = x;
            this.second = y;
        }
    }
    public static ArrayList<Pair> mergeIntervals(ArrayList<Pair> v){
        ArrayList<Pair> result = new ArrayList<Pair>();
        if(v.size() == 0){
            return result;
        }

        Pair currentPair = new Pair(v.get(0).first, v.get(0).second);
        result.add(currentPair);

        for(int i = 1; i < v.size(); i++){
            int currentFirst = currentPair.first;
            int currentSecond = currentPair.second;
            int nextFirst = v.get(i).first;
            int nextSecond = v.get(i).second;

            if(currentSecond >= nextFirst){
                currentPair.second = Math.max(currentSecond, nextSecond);
            }else{
                currentPair = v.get(i);
                result.add(currentPair);
            }
        }
        return result;
    }
    
}
