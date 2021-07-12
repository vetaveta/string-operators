package com.strings.operator.utils;

public class SortUtils {
    private SortUtils() {
    }
    public static void quickSort(char[] arr, int first, int last) {
        if (first < last) {
            char dividerIndex = (char) partition(arr, first, last);
            quickSort(arr, first, (char) (dividerIndex - 1));
            quickSort(arr, dividerIndex, last);
        }
    }
    private static int partition(char[] arr, int first, int last) {
        int rightIndex = last;
        int leftIndex = first;
        char pivot = arr[first];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    private static void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
