package io.ramanan.learning.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        result.add(currentInterval);
        for(int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextEnd = interval[1];
            int nextStart = interval[0];
            if(currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{2,6},{5,9},{8,10},{9,15},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    
}