package com.luxoft.dnepr.courses.unit2;

import java.io.*;
import java.net.*;

/**
 * User: Maxim
 * Date: 28.11.13
 * Time: 22:25
 */
public class HttpWebConnector {
    private static final String URL = "http://programador.ru";


    public String getWebContent(String url) {
        String c;
        StringBuilder content = new StringBuilder();
        BufferedReader input;

        try {
            URL hp = new URL(url);
            URLConnection hpCon = hp.openConnection();

            input = new BufferedReader(
                    new InputStreamReader(hpCon.getInputStream(), "UTF-8"));

            while (((c = input.readLine()) != null)) {
                content.append(c);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }

    public File writeContentToFile(String content) {
        File file = new File("D:/java!/programma.txt");
        FileWriter fileWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return file;
    }

    public void getAndWriteContent() throws Exception {
        HttpWebConnector connector = new HttpWebConnector();
        String content = connector.getWebContent(URL);
        connector.writeContentToFile(content);

    }


}
