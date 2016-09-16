package week2.Homework.Arrays10tasks;

import Utils.ArrayUtils;

/**
 * Created by Andriy on 16.09.2016.
 *
 *4) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class _4CopyOneArrayToAnother {
    public static void main(String[] args){

        int[] array1 = ArrayUtils.createRandomArray(10);
        int[] array2 = ArrayUtils.createRandomArray(10);

        ArrayUtils.printArray(array1);
        ArrayUtils.printArray(array2);

        ArrayUtils.copyArray(array1, array2);

        ArrayUtils.printArray(array1);
        ArrayUtils.printArray(array2);




    }
}
