package lambda.linkMethod.demo1;

public class Demo {

    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 13;
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] highTemps = {new HighTemp(5), new HighTemp(10), new HighTemp(15)};
        count = counter(highTemps, HighTemp::sameTemp, new HighTemp(12));
        System.out.println(count);
    }

}
