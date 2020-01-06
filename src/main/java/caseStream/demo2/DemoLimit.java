package caseStream.demo2;

import java.util.stream.Stream;

public class DemoLimit {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五");

        Stream<String> limit = stream.limit(2);

//        limit.forEach(name-> System.out.println(name));

        Stream<String> skip = limit.skip(1);
        skip.forEach(name-> System.out.println(name));

    }

}
