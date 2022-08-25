package net;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UcDemo {
    public static void main(String[] args) throws Exception {
        URL hp = new URL("http://www.HerbSchildt.com");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        if (d==0) System.out.println("Сведения о дате отсуттсвуют");
        else System.out.println("Дата: "+new Date(d));
    }
}
