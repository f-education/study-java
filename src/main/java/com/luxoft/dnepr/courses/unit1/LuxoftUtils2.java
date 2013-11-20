package com.luxoft.dnepr.courses.unit1;

/**
 * User: Maxim
 * Date: 04.11.13
 * Time: 23:36
 */
public class LuxoftUtils2 {

    private static String[] monthRu = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    private static String[] monthEn = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static String getMonthName(int monthOrder, String language) {

        if (language.equals("ru")) {
            if(monthOrder <= 12 && monthOrder >= 1) {
                return monthRu[monthOrder-1];
            } else {
                return "Неизвестный месяц";
            }

        } else if (language.equals("en")) {
            if(monthOrder <= 12 && monthOrder >= 1){
                return monthEn[monthOrder-1];
            } else {
                return "Unknown month";
            }

        } else {
            return "Unknown Language";
        }
    }


}
