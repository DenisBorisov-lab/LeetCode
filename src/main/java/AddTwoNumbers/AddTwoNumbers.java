package AddTwoNumbers;

import java.util.Arrays;
import java.util.Collections;

public class AddTwoNumbers {
    public static int[] addTwoNumbers(int[] l1, int[] l2) {
        String lOne = "";
        String lTwo = "";
        for (int i = l1.length - 1; i >= 0; i--){
            lOne += l1[i];
        }
        for (int i = l2.length - 1; i >= 0; i--){
            lTwo += l2[i];
        }
        int first = Integer.parseInt(lOne);
        int second = Integer.parseInt(lTwo);
        int result = first + second;
        String res = Integer.toString(result);
        String[] r = res.split("");
        Collections.reverse(Arrays.asList(r));
        int[] c = new int[r.length];
        for (int i = 0; i < r.length; i++){
            int j = Integer.parseInt(r[i]);
            c[i] = j;
        }
        return c;


    }

    public static void main(String[] args) {
        int[] a = {2, 4, 3};
        int[] b = {5, 6, 4};
        System.out.println(Arrays.toString(addTwoNumbers(a, b)));
    }
}
