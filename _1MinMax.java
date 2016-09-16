package week2.Homework.Arrays10tasks;

import Utils.ArrayUtils;

/**
 * Created by Andriy on 16.09.2016.
 *
 * 1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class _1MinMax {
    public static void main(String[] args){

        System.out.println("Random array:");
        int[] myArray = ArrayUtils.createRandomArray(5);
        ArrayUtils.printArray(myArray);

        System.out.println("The min. element in this random array is: " + ArrayUtils.minInArray(myArray));

        System.out.println("The max. element in this random array is: " + ArrayUtils.maxInArray(myArray));




    }

}
