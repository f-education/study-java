package com.luxoft.dnepr.courses.unit2;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * User: Maxim
 * Date: 14.11.13
 * Time: 2:25
 */
public final class LuxoftUtils3 {

         /*
    public static double wordAverageLength(String str) {
        int j = 0;
        char[] arrayChar = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (arrayChar[i] == '\u0020') {
                j++;
            }
        }
        double average = (str.length() - j) / (j + 1.0);
        return average;
    }


    public static String reverseWords(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        StringBuilder sbEnd = new StringBuilder();
        char[] arrayChar = str.toCharArray();
        for (i = 0; i < str.length(); i++) {
            if (arrayChar[i] != '\u0020') {
                sb.append(arrayChar[i]);
            }
            if ((arrayChar[i] == '\u0020') || (i == str.length()-1)) {
                sbEnd.append(sb.reverse());
                if (arrayChar[i] == '\u0020') sbEnd.append(arrayChar[i]);
                sb = new StringBuilder();
            }
        }
        return sbEnd.toString();
    }


    public static char[] getCharEntries(String str) {
        String result = null;
        //char[] rez;
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != '\u0020') map.put(array[i], i);
        }

        for (Map.Entry<Character, Integer> mapNew : map.entrySet()) {
            result = mapNew.getKey().toString();

        }
       // rez = result.toCharArray();
       //String rez = new String(result);
        return result.toCharArray();
    }
                   */
}



