package ch1;

import java.util.Arrays;

public class InsertionSortDecend {

    public static void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[][] test = new int[][] {
                new int[] { 5, 2, 4, 6, 1, 3 },
                new int[] { 6, 5, 4, 3, 2, 1, },
                new int[] { 960, 504, 818, 134, 771, 189, 480, 370, 141, 879, 720, 543, 92, 122, 74, 203, 501, 193, 662,
                        181, 661, 272, 574, 680, 347, 572, 897, 114, 162, 542 }
        };
        for (int i = 0; i < test.length; i++) {
            String origin = Arrays.toString(test[i]);
            sort(test[i]);
            System.out.println(String.format("Test %d: %s\nsorted: %s\n", i, origin, Arrays.toString(test[i])));
        }
    }
}
