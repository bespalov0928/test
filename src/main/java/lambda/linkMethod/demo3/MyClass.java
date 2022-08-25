package lambda.linkMethod.demo3;

public class MyClass<T> {
    private T val;

    MyClass(T v) {
        val = v;
    }

    MyClass() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}
