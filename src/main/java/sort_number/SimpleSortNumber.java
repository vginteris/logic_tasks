package sort_number;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SimpleSortNumber {
    public static void main(String[] args) {
        int arr[] = {10, 34, 8, 56, 7, 67, 88, 42};
        int pass = 0;
        boolean sorted = true;
        int tempNumber;
        int sukiai = 0;

        while (sorted) {
            pass = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    tempNumber = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tempNumber;
                    pass++;
                }
                sukiai++;
            }
            if (pass == 0) break;
        }
        System.out.println(Arrays.toString(arr)+sukiai);
    }
}
