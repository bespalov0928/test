package lambda.linkMethod;

import lambda.StringFunc;

public class MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "dfgdsfgfdg";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);
    }
}
