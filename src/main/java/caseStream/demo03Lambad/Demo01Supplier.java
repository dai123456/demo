package caseStream.demo03Lambad;

import java.util.function.Supplier;

/**
 * Supplier<T>接口被称之为生产型接口，
 * 指定接口的泛型是什么类型，那么接口中的get方法就会生产什么
 *
 **/

public class Demo01Supplier {

    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    public static int getMax(Supplier<Integer> supplier){
        return supplier.get();

    }

    public static void main(String[] args) {
        String string = getString(() -> {
            return "123";
        });
//        System.out.println(string);

        int[] arr = {10,5,20,80,78};
        int max1 = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;

        });

        System.out.println(max1);

    }
}
