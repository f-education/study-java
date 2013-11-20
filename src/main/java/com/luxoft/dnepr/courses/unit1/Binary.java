package com.luxoft.dnepr.courses.unit1;

import java.util.ArrayList;

/**
 * User: Maxim
 * Date: 05.11.13
 * Time: 23:22
 */
public class Binary {

    public static String binaryToDecimal(String binaryNumber) {


        if (isBinaryNumber(binaryNumber)) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            int number = Integer.parseInt(binaryNumber);
            while (number > 0) {
                arrayList.add(number % 10);
                number = number/10; }

            String rez;
            int sum = 0;
            int lenghtArray = binaryNumber.length();
            for (int i = 0; i <= lenghtArray - 1; i++) {
                sum = sum + arrayList.get(i) * (int) Math.pow(2, i);
            }
            rez = String.valueOf(sum);
            return rez;
        } else {
            return "Not binary";
        }
    }

    private static boolean isBinaryNumber(String binaryNumber) {
        char zero = '\u0030';
        char one = '\u0031';
        char[] simbol = binaryNumber.toCharArray();
        for (int i = 0; i < simbol.length; i++) {
            if (simbol[i] == zero || simbol[i] == one) {

            } else {
                return false;
            }
        }
        return true;

    }

    /*public static void main(String[] args) {
        String s = "00011";
        String s1 = "009";
        System.out.println(isBinaryNumber(s));
        System.out.println(isBinaryNumber(s1));
    }                 */

}
