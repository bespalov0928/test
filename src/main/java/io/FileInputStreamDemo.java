package io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try (FileInputStream f = new FileInputStream("C:\\projects\\untitled\\src\\main\\java\\io\\FileInputStreamDemo.java")) {
            System.out.println("Общее количество доступных байтов: " + (size = f.available()));


            int n = size / 40;
            System.out.println("Первые " + n + " байтов, прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.println(f.read());
            }

            System.out.println("\nВсе еще доступно: " + f.available());

            System.out.println("Чтение следующих " + n + "байтов методом read([n])");
            byte b[] = new byte[n];
            if (f.read(b) != n){
                System.err.println("Нельзя прочитать " + n + " байтов");
            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
