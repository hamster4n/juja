package week02.Test;

public class Test {
    public static void main(String[] args) {
//        int[] array = new int[]{1, 1, 1, -10, 2, 3, 5, 8, -2, 1, 3, 5, 1};  //ОК
//        int[] array = new int[]{1, 2, 3, 4, 5}; //ОК
//        int[] array = new int[]{1, 5, 12};  //ОК
//        int[] array = new int[]{100}; //ОК
//        int[] array = new int[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0}; //ОК
//        int[] array = new int[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1}; //ОК
//        int[] array = new int[]{0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1}; //?
//        int[] array = new int[]{0, 1, 1, 1, 0, 1}; //OK

        int[] array = new int[]{1, 2, 0, 0, 0 ,-3, 1, 1};
        int[] result2 = lookFor(array);


        //не забыть удалить саут
        System.out.println("Распечатаем весь массив с индексами отрезков: ");
        for (int element : result2) {
            System.out.println(element);
        }

    }

    public static int[] lookFor(int[] array) {
        int[] vremArray = new int[array.length];
        int[] result = new int[2];
        boolean flag = false;
        int srcPositionVremArray = 0;


        if (array.length == 1) {
            if (array[0] > 0) {
                return new int[]{0, 0};
            } else return new int[0];
        }

        //считываем массив, находим в нём положительное число, записываем его в стартовый (если флаг открыт)
        //и если флаг закрыт, то в конечный
        //пару старт и начало добавляем в массив vremArray
        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0 && i != array.length - 1) {
                if (!flag) {
                    flag = true;
                    result[0] = i;

                } else {
                    result[1] = i;

                }
            } else {

                //переписываем индексы начала и конца границы отрезка из рабочего массива result в массив vremArray
                // (в нём будет храниться инфа о всех отрезках парами по типу: 0-1, 2-3, 4-5 и тд)


                //проверка на последнее число, если оно положительное и перед ним был ноль или
                //если же у положительного числа последнего в массиве перед ним не стоит ноль или минус, то записать его в результ1
                if (array[i] > 0 && i == array.length - 1 && flag == false) {
                    result[0] = i;
                    result[1] = i;
                } else {
                    if (array[i] > 0 && i == array.length - 1) {
                        result[1] = i;
                    }
                }


                flag = false;

                System.arraycopy(result, 0, vremArray, srcPositionVremArray, 2);
                srcPositionVremArray += 2;


                result[0] = 0;
                result[1] = 0;

            }

        }


        //находим диапазон максимальной ширины, если таковых несколько, то правый
        int maxIndex = 0;
        int maxValue = 1;
        for (int i = 0; i < vremArray.length - 1; i = i + 2) {
            if ((vremArray[i + 1] - vremArray[i]) > maxValue) {
                maxIndex = i;
            }

        }

        System.out.println("maxIndex= " + maxIndex + " ; valueMaxIndex= " + vremArray[maxIndex]);

        //запишем в массив result пару старт/финиш максимального диапазона
        result[0] = vremArray[maxIndex];
        result[1] = vremArray[maxIndex + 1];


        return result;
    }
}
