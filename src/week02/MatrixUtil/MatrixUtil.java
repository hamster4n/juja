package week02.MatrixUtil;

import java.util.Arrays;

/**
 * Created by hamster on 26.05.2017.
 */
public class MatrixUtil {
    public static void main(String[] args) {
        int[][] fst = new int[3][2];
        fst[0][0] = 1;
        fst[0][1] = 2;

        fst[1][0] = 7;
        fst[1][1] = 8;

        fst[2][0] = 3;
        fst[2][1] = 4;


        int[][] snd = new int[2][4];
            snd[0][0] = 3;
            snd[0][1] = 4;
            snd[0][2] = 5;
            snd[0][3] = 6;

            snd[1][0] = 9;
            snd[1][1] = 0;
            snd[1][2] = 1;
            snd[1][3] = 2;

        printArr(mul(fst,snd));

    }

    public static int[][] mul(int[][] fst, int[][] snd) {
        /*BODY*/
        int[][] result = new int[fst.length][snd[0].length];


        for (int i = 0; i < fst.length; i++) {
            for (int k = 0; k < fst[0].length; k++) {
                for (int j = 0; j < snd[0].length; j++) {
                    result[i][j] += fst[i][k] * snd[k][j];
                }
            }
        }

        return result;
    }

    public static void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
