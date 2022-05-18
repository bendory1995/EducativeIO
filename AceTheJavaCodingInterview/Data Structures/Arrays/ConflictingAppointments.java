import java.util.*;
public class ConflictingAppointments {
    public static void main(String [] args){

    }
    class Interval {
        int start;
        int end;
      
        public Interval(int start, int end) {
          this.start = start;
          this.end = end;
        }
      };
      
    public static boolean canAttendAllAppointments(Interval[] intervals){
        Arrays.sort(intervals, (a,b) -> Integer.compare(a.start, b.start));

        Interval current = intervals[0];

        for(int i = 1; i < intervals.length; i++){
            int currStart = current.start;
            int currEnd = current.end;

            int nextStart = intervals[i].start;
            int nextEnd = intervals[i].end;

            if(currEnd > nextStart){
                return false;
            }else{
                current = intervals[i];
            }
        }
        return true;
    }
}
