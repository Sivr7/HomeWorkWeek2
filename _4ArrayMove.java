package week2.homework.no_7;

import Utils.ArrayUtils;

/**
 * Created by Andriy on 24.09.2016.
 *
 * 7.4 Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
 Количество позиций и массив указывает пользователь
 */
public class _4ArrayMove {
    static public void main(String[] args){

        int[] arr1 = {};
        int[] arr2 = {5};
        int[] arr3 = {0, 1};
        int[] arr4 = {0, 1, 2, 3, 4, 5, 6};
        int[] arr5 = ArrayUtils.createRandomArray(15);

        ArrayUtils.printArray(arr1);
        ArrayUtils.printArray(arr2);
        ArrayUtils.printArray(arr3);
        ArrayUtils.printArray(arr4);
        ArrayUtils.printArray(arr5);

        ArrayUtils.printArray(ArrayUtils.moveArray(arr1, 3));
        ArrayUtils.printArray(ArrayUtils.moveArray(arr2, 3));
        ArrayUtils.printArray(ArrayUtils.moveArray(arr3, 3));
        ArrayUtils.printArray(ArrayUtils.moveArray(arr4, 3));
        ArrayUtils.printArray(ArrayUtils.moveArray(arr5, 7));

    }
}
