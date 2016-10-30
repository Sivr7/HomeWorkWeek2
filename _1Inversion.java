package week2.homework.no_7;

import Utils.ArrayUtils;

/**
 * Created by Andriy on 24.09.2016.
 *
 * 7.1 Инвертировать массив (без использования допольнительного массива)
 */
public class _1Inversion {
    public static void main(String[] args){

        int[] a = {};
        ArrayUtils.printArray(a);
        ArrayUtils.printArray(ArrayUtils.invertArray(a));

        int[] b = {1};
        ArrayUtils.printArray(b);
        ArrayUtils.printArray(ArrayUtils.invertArray(b));

        int[] c = {1, 2, 3, 4, 5, 6, 7};
        ArrayUtils.printArray(c);
        ArrayUtils.printArray(ArrayUtils.invertArray(c));

        int[] d = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayUtils.printArray(d);
        ArrayUtils.printArray(ArrayUtils.invertArray(d));



 }

}
