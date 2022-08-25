package generalization;

import java.util.*;
import java.io.*;

public class WildCardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        Double v = iob.average();
        System.out.println(v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        Double w = dob.average();
        System.out.println(w);

        if (iob.sameAvg(dob)) {
            System.out.println("равны");
        } else {
            System.out.println("отличаются");
        }

    }

}
