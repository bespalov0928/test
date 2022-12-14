package stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("исходный поток: " + myList);

//        Stream<Integer> myStream = myList.stream();
//        Optional<Integer> minVal = myStream.min(Integer::compare);
//        if (minVal.isPresent()) System.out.println("Минимальное значение: " + minVal.get());

//        myStream = myList.stream();
//        Optional<Integer> maxVal = myStream.max(Integer::compare);
//        if (minVal.isPresent()) System.out.println("Максимальное значение: " + maxVal.get());

//        Stream<Integer> sortedStream = myList.stream().sorted();
//        System.out.println("Отсортированный поток данныхЖ ");
//        sortedStream.forEach((n)->System.out.println(n+" "));
//        System.out.println();

//        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> (n % 2) == 1);
//        System.out.println("Нечетные числа: ");
//        oddVals.forEach(n-> System.out.println(n+" "));
//        System.out.println();

//        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> (n % 2) == 1).filter(n->n>5);
//        System.out.println("Нечетные числа больше 5: ");
//        oddVals.forEach(n-> System.out.println(n+" "));
//        System.out.println();

        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        if (productObj.isPresent()){
            System.out.println(productObj.get());
        }

        int product = myList.stream().reduce(2, (a, b) -> a * b);
             System.out.println(product);

    }
}
