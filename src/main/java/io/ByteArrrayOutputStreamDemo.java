package io;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteArrrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эти данные должны быть выведены в вмассив";
        byte buf[] = s.getBytes();

        try {
            f.write(buf);
        }catch (IOException e){
            System.out.println("Ошибка записи в буфер");
            return;
        }
    }
//    DataOutputStream
//    DataInputStream
}
