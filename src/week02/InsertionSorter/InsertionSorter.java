package week02.InsertionSorter;

import java.util.Arrays;

/**
 * Created by hamster on 10.05.2017.
 */
public class InsertionSorter {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k]; //текущий элемент
            int location = k - 1; //правая граница вставки

            //в массиве ищем с нулевого элемента до правой границы вставки элемент, который будет больше, чем текущий
            int position = Arrays.binarySearch(arr, 0, k, newElement);
            //проверка что возвращает бинарисёрч в случае не нахождения элемента в отсортированной части
            if (position < 0) {
                position = -(position) - 1;
            }


            //начиная с подходящей для вставки позиции копируем правую часть вставки до границы ставки на 1 вправо
            System.arraycopy(arr, position , arr, position + 1, k - position);
            //на освободившееся место вставляем текущий элемент
            arr[position] = newElement;

        }
    }
}
