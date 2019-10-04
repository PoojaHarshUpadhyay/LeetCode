package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //1, 11, 21, 1211, 121221, 12112211
        int nums = 4;
        String result = countnndSay(nums);
        System.out.println(result);
    }

    static String countnndSay(int n) {
        StringBuilder sb = new StringBuilder();

        if (n < 1) {
            return "";
        }
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        String base = "11";
        for (int i = 3; i <= n; i++) {
            base = getActualLogic(base);
        }

        return base;
    }

    static String getActualLogic(String n) {
        StringBuilder sb = new StringBuilder();
        char[] chars = n.toCharArray();
        int count = 1;
        int j = 1;
        while (j < chars.length) {
            if (chars[j - 1] == chars[j]) {
                count++;
            } else {
                sb.append(count);
                sb.append(chars[j - 1]);
                count = 1;
            }
            j++;
        }
        sb.append(count);
        sb.append(chars[j - 1]);
        return sb.toString();
    }
}
