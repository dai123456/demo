package caseStream.demo3;

import java.util.*;
import java.util.stream.Stream;

public class Demo3GetStream {

    public static void main(String[] args) {

        //list获取流
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //set集合获取流
        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        //Map集合获取流
        Map<String,String> map = new HashMap<>();
        //key集合流
        Set<String> set2 = map.keySet();
        Stream<String> stream2 = set2.stream();
        //value集合流
        Collection<String> value = map.values();
        //获取键值对流
        Set<Map.Entry<String, String>> set3 = map.entrySet();
        Stream<Map.Entry<String, String>> stream3 = set3.stream();

        //stream.of

    }


}
