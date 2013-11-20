package com.luxoft.dnepr.courses.unit1;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 12.11.13
 * Time: 0:13
 * To change this template use File | Settings | File Templates.
 */
public final class BubleSort {

    public static int[] sortArray(int[] array, boolean asc) {
        int size = array.length;
        int swap, i, j;

        if (asc) {
            for (j = 0; j < size; j++) {
                for (i = 1; i < size - j; i++) {
                    if (array[i] < array[i - 1]) {
                        swap = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = swap;
                    }
                }
            }
        }
        if (!asc) {
            for (j = 0; j < size; j++) {
                for (i = 1; i < size - j; i++) {
                    if (array[i] >  array[i - 1]) {
                        swap = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = swap;
                    }
                }
            }
        }
        return array;
    }

}