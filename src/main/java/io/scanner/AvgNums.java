package io.scanner;

import java.util.Scanner;

public class AvgNums {
    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;

        while (conin.hasNext()){
            if (conin.hasNextDouble()){
                sum += conin.nextDouble();
                count++;
            }else {
                String str = conin.next();
                if (str.equals("готово")) break;
                else {
                    System.out.println("ОШибка формата");
                    return;
                }
            }
        }
        conin.close();
        System.out.println(sum/count);
    }
}
