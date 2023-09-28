package task8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printIndexes(double firstArray[], double secondArray[]) {
        for (double v : secondArray) {
            System.out.println(binarySearch(firstArray, 0, firstArray.length - 1, v));
        }
    }

    public static int[] findIndexes(double firstArray[], double secondArray[]){
        int[] result = new int[secondArray.length];
        for (int i = 0; i < secondArray.length; i++) {
            result[i] = binarySearch(firstArray, 0, firstArray.length - 1, secondArray[i]);
        }
        return result;
    }

    static int binarySearch(double[] array, int left, int right, double searchedElem) {
        int middle = -1;
        if (searchedElem < array[left])
            return left;
        if (searchedElem > array[right])
            return right;
        while (left <= right) {
            middle = (left + right) / 2;
            if (searchedElem >= array[middle] && searchedElem < array[middle + 1])
                return middle + 1;
            if (searchedElem < array[middle])
                right = middle - 1;
            if (searchedElem > array[middle])
                left = middle + 1;
        }
        return middle;
    }

    public static void main(String[] args) {
        printIndexes(new double[]{1, 2, 3, 4, 5, 6}, new double[]{0, 4, 6, 8, 9, 10});
    }

}
