package week02.Permutator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hamster on 24.05.2017.
 */
public class Permutator {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, arr.length);
    }
    public static void permutation(int[] list, int size) {
//        System.out.println("Вызов функции. size = " + size);
        if (size < 2) {
            System.out.println(Arrays.toString(list));

        } else {
            for (int k = 0; k < size; k++) {
                swap(list, k, size - 1);
//                System.out.println("после свапа " + k + " " +  Arrays.toString(arr));
                permutation(list, size - 1);
                swap(list, k, size - 1);
            }
        }
    }
    public static void swap(int[] list, int indexA, int indexB) {
        int tmp = list[indexA];
        list[indexA] = list[indexB];
        list[indexB] = tmp;
    }
}
