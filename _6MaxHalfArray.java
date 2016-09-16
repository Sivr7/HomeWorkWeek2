package week2.Homework.Arrays10tasks;

import Utils.ArrayUtils;

/**
 * Created by Andriy on 16.09.2016.
 *
 *  6) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */
public class _6MaxHalfArray {
    public static void main(String[] args){

        int[] myArr = ArrayUtils.createRandomArray(5);

        System.out.println("Random array: ");
        ArrayUtils.printArray(myArr);

        System.out.println("Half of the array with bigger arithmetic mean: ");
        ArrayUtils.printArray(ArrayUtils.biggerMeanHalf(myArr));

    }

}
