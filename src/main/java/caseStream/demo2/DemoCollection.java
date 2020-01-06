package caseStream.demo2;

import caseStream.dto.PersonDto;

import java.util.stream.Stream;

public class DemoCollection {

    public static void main(String[] args) {
        //filter  foreach  skip  limit  concat  map
        //练习题

        //两个集合  使用filter  skip
        Stream<String> stream1 = Stream.of("张三", "张三三", "李小小", "李玉");
        Stream<String> final1 = stream1.skip(1)
                .filter(name -> name.startsWith("张"));
//        final1.forEach(name-> System.out.println(name));

        //使用filter 和limit
        Stream<String> stream2 = Stream.of("json", "jaa", "ppp", "12134");
        Stream<String> final2 = stream2.limit(3).filter(name -> name.length() == 3).filter(name -> name.startsWith("j"));
//        final2.forEach(name-> System.out.println(name));

        Stream.concat(final1, final2).map(name -> new PersonDto(name)).forEach(p-> System.out.println(p.getName()));
//        personDtoStream.forEach(name-> System.out.println(name.getName()));
    }
}
