package week02.InsertionSorter;

import java.util.Arrays;

/**
 * Created by hamster on 10.05.2017.
 */
public class OnlyTest {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 1, 1, 9, 21, 31, 54, 82};
        int position = Math.abs(Arrays.binarySearch(array1, 0, 5, 9)) ;
        System.out.println(position);
    }
}
