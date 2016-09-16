package week2.Homework.Arrays10tasks;

import Utils.ArrayUtils;

/**
 * Created by Andriy on 16.09.2016.
 *
 * 7) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
 который получается в результате суммы arr1[i] + arr2[i]
 */
public class _7SumOfTwoArrays {
    public static void main(String[] args){

        int[] a = ArrayUtils.createRandomArray(5);
        int[] b = ArrayUtils.createRandomArray(5);

        System.out.println("Array 1: ");
        ArrayUtils.printArray(a);
        System.out.println("Array 2: ");
        ArrayUtils.printArray(b);

        int[] c = ArrayUtils.sumTwoArrays(a, b);
        System.out.println("Summed array: ");
        ArrayUtils.printArray(c);

    }

}
