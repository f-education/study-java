package com.dnepr.education.module1.unit1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 30.10.13
 * Time: 23:14
 * To change this template use File | Settings | File Templates.
 */
public final class CalcUtils {

    public static Map<String, Double> getRootsQuadraticEq(int a, int b, int c) {

        Map<String, Double> hashmap = new HashMap<String, Double>();
        int discrimenant = b * b - 4 * a * c;

        try {

            if (discrimenant > 0) {
                double x1 = (-b + Math.sqrt(discrimenant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discrimenant)) / (2 * a);
                hashmap.put("x1", x1);
                hashmap.put("x2", x2);
            } else if (discrimenant == 0) {
                double x = -b / (2 * a);
                hashmap.put("x", x);
            } else {
                double x = Double.NaN;
                hashmap.put("x", x);
            }

        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            hashmap.put("x1", Double.NaN);
            hashmap.put("x2", Double.NaN);
        }

        return hashmap;
    }
}


