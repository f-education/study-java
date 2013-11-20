package com.luxoft.dnepr.courses.unit1;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 08.11.13
 * Time: 22:04
 * To change this template use File | Settings | File Templates.
 */
public class Decimal {

    public static String decimalToBinary(String decimalNumber) {
        int newNumber, number, modulo;
        String rez, rezEnd;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try {
            number = Integer.parseInt(decimalNumber);
            while (number != 0) {
                newNumber = number / 2;
                modulo = number - newNumber * 2;
                arrayList.add(modulo);
                number = newNumber;
            }
        } catch (NumberFormatException ex) {
            //System.out.println(ex.getMessage());
            //rez3 = "Not decimal";

        }
        if (arrayList.size() == 0)  {rezEnd = "Not decimal";
        } else {

        rez = String.valueOf(arrayList);
        StringBuffer stringBuffer = new StringBuffer(rez.subSequence(1, rez.length() - 1));
        String rezReverse = stringBuffer.reverse().toString();
        rezReverse = String.valueOf(rezReverse);
        rezEnd = rezReverse.replaceAll(" ,", "");
        }
        return rezEnd;
    }

}
