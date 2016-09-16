package week2.Homework.Arrays10tasks;

import Utils.ArrayUtils;

/**
 * Created by Andriy on 16.09.2016.
 *
 * 	2) Найти среднее арифметическое массива
 */
public class _2ArithmeticMeanOfArray {
    public static void main(String[] args){

        int[] myArr = ArrayUtils.createRandomArray(5);
        ArrayUtils.printArray(myArr);

        System.out.println("Arithmetic mean of the elements in this array = " + ArrayUtils.meanOfArray(myArr));

    }
}
