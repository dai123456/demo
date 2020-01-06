package caseStream.demo2;

import java.util.stream.Stream;

/**
 * 如果需要将流中的元素映射到另一个流中，可以使用map方法，
 */
public class DeamoMap {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");

        Stream<Integer> integerStream = stringStream.map((String s) -> {
            return Integer.parseInt(s);
        });

        integerStream.forEach(s-> System.out.println(s));

    }
}
