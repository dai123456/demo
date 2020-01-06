package caseStream.demo2;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo02Stream_forEach {
    public static void main(String[] args) {
        //获取一个stream流
        Stream<String> stream = Stream.of("张一","张2","张3","张4");
        stream.forEach(name-> System.out.println(name));

        //stream流只能使用一次
//        stream.filter((String name)->{name.length()==3});

    }


    //stream流只能使用一次

    //将流中的元素映射到另一个流中，可以使用map方法

    //stream流中skip的用法

    //stream流中cancat的用法

    //compare

    //supplier

    //通过supplier求数组最大值

    //consumer接口

    //andthen

    //consumer+andthen字符串拼接

    //Predicate及and判断


    //Predicate接口_默认方法or&negate

    //Predicate  姓名长度四   必须女性

    //Function接口

    //Function接口_默认方法andThen

    //Function接口练习_自定义函数模型拼接
}
