package lambda;

public class Lambda {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда";
        StringFunc stringFunc = str->str.toUpperCase();
        System.out.println(stringFunc.func(inStr));

        String outStr = stringOp(stringFunc, inStr);
        System.out.println(outStr);
    }
}
