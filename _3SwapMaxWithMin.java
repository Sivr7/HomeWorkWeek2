package week2.Homework.Arrays10tasks;

import Utils.ArrayUtils;

/**
 * Created by Andriy on 16.09.2016.
 *
 * 3) Поменять местами наибольший
 и наименьший элементы в массиве
 */
public class _3SwapMaxWithMin {
    public static void main(String[] args){

        int[] myArr =  ArrayUtils.createRandomArray(5);
        ArrayUtils.printArray(myArr);

        System.out.println("max = " + ArrayUtils.maxInArray(myArr));
        System.out.println("min = " +ArrayUtils.minInArray(myArr));

        System.out.println("New array with swapped min and max: ");
        ArrayUtils.printArray(ArrayUtils.swapMaxMinArray(myArr));
    }
}
