import java.util.*;
public class MergeIntervals {
    public static void main(String [] args){
    }

    public class Interval {
        int start;
        int end;
      
        public Interval(int start, int end) {
          this.start = start;
          this.end = end;
        }
      };
      

    public static List<Interval> merge(List<Interval> intervals){
        if(intervals.size() < 2) return intervals;

        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        List<Interval> mergedIntervals = new LinkedList<Interval>();

        Interval currentInterval = intervals.get(0);
        mergedIntervals.add(currentInterval);

        for(int i = 0 ; i < intervals.size(); i++){
            int currentStart = currentInterval.start;
            int currentEnd = currentInterval.end;

            int nextStart = intervals.get(i).start;
            int nextEnd = intervals.get(i).end;

            if(currentEnd >= nextStart){
                currentInterval.end = Math.max(currentEnd, nextEnd);
            }else{
                currentInterval = intervals.get(i);
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals;

    }
}
