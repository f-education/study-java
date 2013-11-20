package com.luxoft.dnepr.courses.unit2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 20.11.13
 * Time: 0:35
 * To change this template use File | Settings | File Templates.
 */
public class itest {
    public static void main(String[] args) {
        String str = "Alice";
        char[] array = str.toCharArray();
        Arrays.sort(array);
        int i;
        for (i = 0; i < array.length; i++){
            if (array[i] == array[i-1]) Arrays.re
            remove(array[i]);

        }

        System.out.print(Arrays.toString(array));



    }
}
