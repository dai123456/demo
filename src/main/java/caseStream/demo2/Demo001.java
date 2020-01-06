package caseStream.demo2;

import java.util.stream.Stream;

public class Demo001 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张三", "李四", "王五");

        Stream<String> stream2 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        //stream流只能使用一次
//        stream.filter(name->{return name.startsWith("王");});

        stream2.forEach((String name)-> System.out.println(name));
    }
}
