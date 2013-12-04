package com.dnepr.education.module1.unit1;

import java.net.*;

/**
 * Created with IntelliJ IDEA.
 * User: Maxim
 * Date: 28.11.13
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
//        System.get
        System.out.println(Address);

        Address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(Address);

        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }
    }
}
