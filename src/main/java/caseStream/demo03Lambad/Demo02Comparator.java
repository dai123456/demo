package caseStream.demo03Lambad;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {

    public static Comparator<String> getComparator(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };

        return (o1,o2)->{
            return o2.length()-o1.length();
        };

    }

    public static void main(String[] args) {
        String[] arr = {"aa","b","cccc","qqqqqqqqqq"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator());

        System.out.println(Arrays.toString(arr));
    }

}
