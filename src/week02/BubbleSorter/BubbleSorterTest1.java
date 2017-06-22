package week02.BubbleSorter;

import java.util.Arrays;

/**
 * Created by hamster on 05.05.2017.
 */
public class BubbleSorterTest1 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] array1 = new int[]{1, 1, 1, -10, 2, 3, 5, 8, -2, 1, 3, 5, 1};
        int[] array2 = new int[]{-10, -2, 1, 1, 1, 1, 1, 2, 3, 3, 5, 5, 8};
        BubbleSorter.sort(array1);

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                flag = false;
            }
        }

        if (flag == false){
            System.out.println("Incorrect!");
        } else{
            System.out.println("Corret test!");
            //добавить распечатку обоих массивов для визуализации
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
        }
    }
}
