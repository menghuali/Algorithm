package ch1;

import java.util.Arrays;

public class NbitBinaryIntegerSum {

    public static int[] sum(int[] a, int[] b) {
        int[] c = new int[a.length + 1];
        int carry = 0;
        for (int i = 0; i < a.length; i++) {
            int value = a[i] + b[i] + carry;
            c[i] = value % 2;
            carry = value / 2;
        }
        c[c.length - 1] = carry;
        return c;
    }

    public static void main(String[] args) {
        int[][][] test = new int[][][] {
                new int[][] {
                        new int[] { 0, 0, 0 },
                        new int[] { 1, 0, 0 },
                        new int[] { 1, 0, 0, 0 }
                },
                new int[][] {
                        new int[] { 1, 0, 0 },
                        new int[] { 1, 0, 0 },
                        new int[] { 0, 1, 0, 0 }
                },
                new int[][] {
                        new int[] { 1, 1, 1 },
                        new int[] { 1, 1, 1 },
                        new int[] { 0, 1, 1, 1 }
                }
        };
        for (int i = 0; i < test.length; i++) {
            int[] a = test[i][0];
            int[] b = test[i][1];
            int[] expect = test[i][2];
            int[] c = sum(a, b);
            System.out.println(String.format("Test %d: a=%s, b=%s, expect=%s, actual=%s", i, Arrays.toString(a),
                    Arrays.toString(b), Arrays.toString(expect), Arrays.toString(c)));
        }
    }

}
