package week2.homework.arrays_10_tasks;

import Utils.ArrayUtils;

/**
 * Created by Andriy on 23.09.2016.
 *
 *  	10) Написать метод, который будет обрезать массив по границам start и end

 public static int[] splitArray(int[] arr, int start, int end) {
 // обрезать массив по границам start и end
 }
 */
public class _10TrimStartEnd {
    public static void main(String[] args){

        int[] arr = ArrayUtils.createRandomArray(6);

        ArrayUtils.printArray(arr);


        int[] arrN = ArrayUtils.trimArray(arr, 2, 5);

        ArrayUtils.printArray(arrN);







    }

}
