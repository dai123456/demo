package caseStream.demo03Lambad;

import java.util.function.Predicate;

public class Demo04Predicate {

    public static boolean checkString(String s, Predicate<String> pred){
        return pred.test(s);
    }
}
