package com.strings.operator.utils;


import java.util.Arrays;

public class StringUtils {
    private StringUtils() {
    }

    public static String capitalizeString(String a, String b) {
        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);
        return a + " " + b;
    }

    public static boolean isAnagram(String a, String b) {
        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();
        SortUtils.insertionSort(aChars);
        SortUtils.insertionSort(bChars);
        return Arrays.equals(aChars, bChars);
    }
}
