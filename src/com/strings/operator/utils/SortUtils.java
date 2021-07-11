package com.strings.operator.utils;

public class SortUtils {
    private SortUtils() {
    }

    public static void insertionSort(char[] array) {
        for (int i = 1; i < array.length; i++) {
            char current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }
}
