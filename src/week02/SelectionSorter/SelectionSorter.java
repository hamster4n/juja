package week02.SelectionSorter;

/**
 * Created by hamster on 10.05.2017.
 */
public class SelectionSorter {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int min = barrier;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[min] > arr[index]) {
                    min = index;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[barrier];
            arr[barrier] = tmp;
        }
    }
}
