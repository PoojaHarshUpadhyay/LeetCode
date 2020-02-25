package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        String word = "Hello World";
        String result = reverseVowel(word);
        System.out.println(result);
    }

    public static String reverseVowel(String text) {
        // Write your code here
        char[] chars = text.toCharArray();
        int i = 0;
        int j = text.length() - 1;
        while (i < j) {
            if (!isVowel(chars[i])) {
                i++;
                continue;
            }
            if (!isVowel(chars[j])) {
                j--;
                continue;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        String str = String.copyValueOf(chars);
        return str;
    }

    private static boolean isVowel(char v) {
        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' ||
                v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U') {
            return true;
        } else {
            return false;
        }
    }


}
