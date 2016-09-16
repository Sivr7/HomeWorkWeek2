package Utils;

/**
 * Created by Andriy on 10.09.2016.
 */
public class ArrayUtils {

// prints out array in line and moves caret below
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

// creates array with given size
    public static int[] createArray (int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = i;
        }
        return array;
    }

// creates random array with given size
    public static int[] createRandomArray (int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = (int)(Math.random() * 100);
        }
        return array;
    }

// creates random array with given size where even elements are assigned to even indices and odd elements to odd indices
    public static int[] createRandomArrayEvenOds (int size){
    int[] array = new int[size];
    for(int i = 0; i < size; i++){
        if(i % 2 == 0){
            int elem = (int)(Math.random() * 100);
            while(elem % 2 != 0){
                elem = (int)(Math.random() * 100);
            }
            array[i] = elem;
        } else if(i % 2 != 0){
            int elem = (int)(Math.random() * 100);
            while(elem % 2 == 0){
                elem = (int)(Math.random() * 100);
            }
            array[i] = elem;
        } else {
            int elem = (int)(Math.random() * 100);
        }
    }
    return array;
    }

// finds min in array
    public static int minInArray(int[] array){
        if(array.length == 0) return 0;
        int i = 0;
        int min = Math.min(array[i], array[i + 1]);
        for(i = 1; i < array.length - 1; i++){
            min = Math.min(min, Math.min(array[i], array[i + 1]));
        }
        return min;
    }

// sorts array and finds min in it
    /*public static int minInArray(int[] array){
        if(array.length == 0) return 0;
        bubbleSort(array);
        return array[0];
    }*/

// finds max in array
    public static int maxInArray(int[] array){
        if(array.length == 0) return 0;
        int i = 0;
        int max = Math.max(array[i], array[i + 1]);
        for(i = 1; i < array.length - 1; i++){
            max = Math.max(max, Math.max(array[i], array[i + 1]));
        }
        return max;
    }

// swaps min with max in array
    public static int[] swapMaxMinArray(int[] array){
        if(array.length == 0) return array;
        int max = maxInArray(array);
        int min = minInArray(array);
        int indexMax = 0;
        int indexMin = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == max){
                indexMax = i;
            }
            if(array[i] == min){
                indexMin = i;
            }
        }
        int temp = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = temp;
        //swapCreateNew(array, array[indexMax], array[indexMin]);
        return array;
    }

/*// sorts array and finds max in it
    public static int maxInArray(int[] array){
        if(array.length == 0) return 0;
        bubbleSort(array);
        return array[array.length - 1];
    } */

// finds arithmetic mean of array
    public static double meanOfArray(int[] array){
        if(array.length == 0) return 0;
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return Math.floor((double)sum / array.length * 100) / 100;
    }

// compares two halves of even-numbered array and returns an array which has bigger arithmetic mean
    public static int[] biggerMeanHalf(int[] array){
        if(array.length % 2 == 0){
            int[] arr1 = new int[array.length / 2];
            int[] arr2 = new int[array.length / 2];
            int i = 0;
            for(; i < (array.length / 2); i++){
                arr1[i] = array[i];
            }
            double a = meanOfArray(arr1);

            for(int j = 0; j < array.length / 2; j++) {
                arr2[j] = array[i + j];
            }
            double b = meanOfArray(arr2);

            if(a == b){
                return array;
            } else if(a > b){
                return arr1;
            } else {
                return arr2;
            }
        } else {
            int[] x = {};
            return x;
        }

    }

// creates array with given size from min to max
    public static int[] createRandomArray(int size, int min, int max){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = (int)(min + Math.random() * (max - min));
        }
        return array;
    }

// sorts arrays
    public static void bubbleSort(int[] array) {
        for(int j = array.length - 1; j >= 0; j--){
            for(int i = 0; i < j; i++){
                if(array[i] > array[i + 1]){
                    swap(array, i, i + 1);
                }
            }
        }
    }

// sorts Strings
    public static String[] bubbleSort(String[] array) {
        for(int j = array.length - 1; j >= 0; j--){
            for(int i = 0; i < j; i++){
                if(array[i].compareTo(array[i + 1]) > 0){
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

// returns given array as String
    public static String arrayToString(int[] array){
        if(array == null) return null;
        String arrayAsString = "[";
        for(int i = 0; i < array.length - 1; i++){
            arrayAsString += array[i] + ", ";
        }
        if(array.length > 0){
            arrayAsString += array[array.length - 1];
        }
        return arrayAsString  + "]";
    }

// swaps i-element for j-element in given array
    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

/* //swaps i-element for j-element in given array and returns another array
    public static int[] swapCreateNew(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return  array;
    }*/

// swaps i-element for j-element in given Object
    private static void swap(Object[] array, int i, int j){
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

// copies elements from one array into another with the same length
    public static int[] copyArray(int[] orgArray, int[] destArray){
        if(orgArray.length == destArray.length){
            for(int i = 0; i < orgArray.length; i++){
                destArray[i] = orgArray[i];
            }
            return destArray;
        }
        return null;
    }

// counts occurrence of certain number in array
    public static int countNum(int[] array, int a){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == a) count++;
        }
        return count;
    }

// sums elements in two arrays of the same length and creates new array with summed elements
    public static int[] sumTwoArrays(int[] arr1, int[] arr2){
        if(arr1.length == arr2.length){
            int[] summedArr = new int[arr1.length];
            for(int i = 0; i < arr1.length; i++){
                summedArr[i] = arr1[i] + arr2[i];
            }
            return summedArr;
        } else {
            int[] x = {};
            return x;
        }
    }

// defines which array of two has more even elements
    public static void arrayWithMoreEvenEl(int size, int min, int max){
        int[] a = createRandomArray(size, min, max);
        int[] b = createRandomArray(size, min, max);

        printArray(a);
        printArray(b);

        int countA = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0) countA++;
        }

        int countB = 0;
        for(int i = 0; i < a.length; i++){
            if(b[i] % 2 == 0) countB++;
        }

        if(countA > countB){
            System.out.println("First array has more even numbers.");
        } else if (countA < countB) {
            System.out.println("Second array has more even numbers.");
        } else {
            System.out.println("Both arrays have equal number of even numbers.");
        }

    }



}
