package ch1;

import java.util.Arrays;

/**
 * We start with insertion sort, which is an efûcient algorithm for sorting a
 * small number of elements. Insertion sort works the way you might sort a hand
 * of playing cards. Start with an empty left hand and the cards in a pile on
 * the table. Pick up the first card in the pile and hold it with your left
 * hand. Then, with your right hand, remove one card at a time from the pile,
 * and insert it into the correct position in your left hand. You find the
 * correct position for a card by comparing it with each of the cards already in
 * your left hand, starting at the right and moving left. As soon as you see a
 * card in your left hand whose value is less than or equal to the card you’re
 * holding in your right hand, insert the card that you’re holding in your right
 * hand just to the right of this card in your left hand. If all the cards in
 * your left hand have values greater than the card in your right hand, then
 * place this card as the leftmost card in your left hand. At all times, the
 * cards held in your left hand are sorted, and these cards were originally the
 * top cards of the pile on the table.
 */
public class InsertionSort {

    public static void sort(int[] array) {
        if (array == null || array.length == 1) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
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
