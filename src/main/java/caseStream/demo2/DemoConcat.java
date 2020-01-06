package caseStream.demo2;

import java.io.Serializable;
import java.util.stream.Stream;

public class DemoConcat {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2);
        Stream<String> strStream = Stream.of("111","李四");

        Stream<? extends Serializable> concat = Stream.concat(integerStream, strStream);

        concat.forEach(ss-> System.out.println(ss));


    }
}
