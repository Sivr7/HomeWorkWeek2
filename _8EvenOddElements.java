package week2.Homework.Arrays10tasks;

import Utils.ArrayUtils;

/**
 * Created by Andriy on 16.09.2016.
 *
 * 8) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
 */
public class _8EvenOddElements {
    public static void main(String[] args){

        int[] arr = ArrayUtils.createRandomArrayEvenOds(10);

        ArrayUtils.printArray(arr);




    }
}
