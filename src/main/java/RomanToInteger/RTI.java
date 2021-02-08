package RomanToInteger;

import java.util.ArrayList;
import java.util.Collections;

public class RTI {
    public static int romanToInt(String s) {
        String[] chars = s.split("");
        ArrayList<Integer> arrayList = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < chars.length; i++){
            switch (chars[i]){
                case "I": arrayList.add(1);
                    break;
                case "V": arrayList.add(5);
                    break;
                case "X": arrayList.add(10);
                    break;
                case "L": arrayList.add(50);
                    break;
                case "C": arrayList.add(100);
                    break;
                case "D": arrayList.add(500);
                    break;
                case "M": arrayList.add(1000);
                    break;
            }
        }
        int maxTarget = Collections.max(arrayList);
        int indexOfMax = arrayList.indexOf(maxTarget);
        int subtrahend = 0;
        for (int i = 0; i < indexOfMax; i++){
            subtrahend += arrayList.get(i);
        }
        int minuend = 0;
        for (int i =  indexOfMax; i < arrayList.size(); i++){
            minuend += arrayList.get(i);
        }
        return minuend - subtrahend;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
