package week02.InsertionSorter;

import java.util.Arrays;

/**
 * Created by hamster on 10.05.2017.
 */
public class InsertionSorterTest1 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] array1 = new int[]{1, 1, 1, -10, 2, 3, 5, 8, -2, 1, 3, 5, 1};
        int[] array2 = new int[]{-10, -2, 1, 1, 1, 1, 1, 2, 3, 3, 5, 5, 8};
        InsertionSorter.sort(array1);

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                flag = false;
            }
        }

        if (flag == false){
            System.out.println("Incorrect  test!");
        } else{
            System.out.println("Correct test!");
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
        }
    }
}
