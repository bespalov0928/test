package net;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UrlDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com");
        System.out.println("Протокол: "+hp.getProtocol());
        System.out.println("Порт: "+hp.getPort());
        System.out.println("Хост: "+hp.getHost());
        System.out.println("Файл: "+hp.getFile());
        System.out.println("Полная форма: "+hp.toExternalForm());
    }
}
