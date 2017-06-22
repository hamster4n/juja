package week02.BubbleSorter;

/**
 * Created by hamster on 05.05.2017.
 */
public class BubbleSorter {
    public static void sort(int[] arr){
//        for (int barrier = arr.length-1;barrier>=0;barrier --){
//            for (int index =0; index < barrier; index++){
//                if (arr[index] > arr[index+1]){
//                    int tmp = arr[index];
//                    arr[index] = arr[index+1];
//                    arr[index+1]=tmp;
//                }
//            }
//        }

        for (int barrier = 0; barrier < arr.length; barrier++){
            for (int index = arr.length-1; index > barrier; index--){
                if (arr[index] < arr[index-1]){
                    int tmp = arr[index];
                    arr[index] = arr[index-1];
                    arr[index-1] = tmp;
                }
            }
        }


    }
}
