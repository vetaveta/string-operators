package com.strings.operator;

import com.strings.operator.utils.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a.length() + b.length());
        boolean compareString = StringUtils.isAnagram(a, b);
        System.out.println(compareString);
        String cap = StringUtils.capitalizeString("hello", "aca");
        System.out.println(cap);
    }
}
