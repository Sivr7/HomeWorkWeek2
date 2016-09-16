package week2.Homework.Arrays10tasks;

import Utils.ArrayUtils;

import java.util.Scanner;

/**
 * Created by Andriy on 16.09.2016.
 *
 * 	5) Посчитать сколько раз цифра(цифра задается пользователем) встречается в случайно сгенерированом массиве
 */
public class _5OccurrenceOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number from 0 to 99: ");

        int userNumber = sc.nextInt();

        int[] randomArr = ArrayUtils.createRandomArray(40);

        ArrayUtils.printArray(randomArr);

        System.out.println("Number of occurrences = " + ArrayUtils.countNum(randomArr, userNumber));





    }
}
