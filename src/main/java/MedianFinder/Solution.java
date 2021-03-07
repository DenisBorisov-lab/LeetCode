package MedianFinder;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    ArrayList<Integer> median = new ArrayList<>();

    public void addNum(int num){
        median.add(num);
    }

    public double findMedian(){
        Collections.sort(median);
        if (median.size() == 0){
            return 0;
        }
        if ((double) median.size() / 2 == 0){
            return (median.get(median.size() / 2) + median.get(median.size() / 2 - 1)) / 2;
        }else {
            return (double) (median.get(median.size()/ 2));
        }
    }
}
