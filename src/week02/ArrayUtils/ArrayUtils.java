package week02.ArrayUtils;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * Created by hamster on 26.05.2017.
 */
public class ArrayUtils {
    public static void main(String[] args) {
        int counter = 1;
//        int[][] arr = new int[3][3];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = counter;
//                counter++;
//            }
//        }

        int[][] arr = new int[][]{{0,0}, null};

//        System.out.println("Исходная матрица: ");
//        printArr(arr);
//        System.out.println("Повёрнутая матрица: ");
//        printArr(rotateClockwise(arr));
        rotateClockwise(arr);
    }

    public static int[][] rotateClockwise(int[][] arg) {
        /*BODY*/
        //1) проверяет, что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...)
        // иначе возвращать null
        //(возможные ошибки: null вместо массива, одна из размерностей = 0, длина не равна ширине,
        // есть строки разной длины, есть строки с null вместо одномерных массивов)



        //2) "проворачивает" массив по часовой стрелке на 90 градусов
        boolean check = matrixCheck(arg);
        if(check == false) return null;

        int size = arg.length;
        for (int i = 0; i < size / 2; i++) {
            for (int j = i; j < size - 1 - i; j++) {
                int tmp = arg[i][j];
                arg[i][j] = arg[size - j - 1][i];
                arg[size - j - 1][i] = arg[size - i - 1][size - j - 1];
                arg[size - i - 1][size - j - 1] = arg[j][size - i - 1];
                arg[j][size - i - 1] = tmp;
            }
        }
        return arg;
    }

    public static boolean matrixCheck (int[][] arr){

        if(arr == null) {
            System.out.println("сработка 1");
            return false;
        }



        int size = arr.length;
        if (size == 0 ) {
            System.out.println("сработка 3");
            return false;
        }
        if (arr[0] == null){
            System.out.println("Сработка 2");
            return false;
        }
        System.out.println("size = " + size);


        for (int[] element: arr) {
            //проверка на содержание null вместо строки
            if (element == null) return  false;
            //проверка на квадратность матрицы
            if (element.length != size) return  false;
        }
        return true;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
