package com.luxoft.dnepr.courses.unit2;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 20.11.13
 * Time: 0:35
 * To change this template use File | Settings | File Templates.
 */
public class itest {
    public static void main(String[] args) {
        String str = "  AAbbCC zZ";
        String result;
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        char[] array = str.toCharArray();

        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] != '\u0020') map.put(array[i], i);
        }

        for (Map.Entry<Character, Integer> mapNew : map.entrySet()) {
            result = mapNew.getKey().toString();
            System.out.print(result);
        }
    }
}
