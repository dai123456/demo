package caseStream.demo1;

import java.util.ArrayList;
import java.util.List;

public class Demo1ForEach {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("张思");
        list.add("张柳");

//        for(String str:list){
//            if(str.equals("张三")){
//                System.out.println(str);
//            }
//        }
//
//        for(String str:list){
//            if(str.length() == 2){
//                System.out.println(list.get(2));
//            }
//        }
        //a.length()表示字段长度
        list.stream().filter(a->a.startsWith("张"))
                .filter(a->a.length()==2)
                .forEach(a-> System.out.println(a));



    }
}
