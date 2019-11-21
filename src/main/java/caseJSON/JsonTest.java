package caseJSON;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dq.dto.UserDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonTest {

//    根据源码显示：JSON是一个抽象类，JSON中有一个静态方法parseObject(String text)，
// 将text解析为一个JSONObject对象并返回;JSONObject是一个继承自JSON的类，
// 当调用JSONObject.parseObject(result)时，会直接调用父类的parseObject(String text)。
// 所以两者没什么区别，一个是用父类去调用父类自己的静态的parseObject(String text)，
// 一个是用子类去调用父类的静态parseObject(String text)，两者调的是同一个方法。

   //https://www.w3cschool.cn/fastjson/fastjson-demo1.html   json的实用链接

    //psvm快捷键
    public static void main(String[] args) {
        //采用com.alibaba.fastjson.JSONObject工具类
        //字符串转json
//        JSONObject jsonO;
//        //json的字符串格式 属性用双引号包住，双引号由右斜杠（\）转义
//        //纯粹的字符串格式
//        String strJson = "{\"name\":\"tom\"}";
//        jsonO = JSONObject.parseObject(strJson);
//        System.out.println("============"+jsonO);
//
////        String arrJson = "{\"list\":[{\"name\":\"tom\",\"age\":\"12\",\"sex\":\"male\"}]}";
//        String arrJson = "{\"list\":[{\"name\":\"tom\",\"age\":\"12\",\"sex\":\"male\"}," +
//                "{\"name\":\"tom\",\"age\":\"12\",\"sex\":\"male\"}]}";
//        jsonO = JSONObject.parseObject(arrJson);
//        System.out.println("============"+jsonO);
//
//        String combinationJson = "{\"name\":\"tom\"," +
//                "\"list\":[{\"name\":\"tom\",\"age\":\"12\",\"sex\":\"male\"}]}";
//
//        jsonO = JSONObject.parseObject(combinationJson);
//        System.out.println("============"+jsonO);

//
//        UserDto user0 = new UserDto();
//        user0.setName("tom");
//        user0.setAge("11");
//
//        String strUser = JSON.toJSONString(user0);
//        System.out.println(strUser);
//
//        Map map = (Map)JSON.toJSON(user0);
//        System.out.println(map.get("name"));
//
//        UserDto userDto = JSON.toJavaObject((JSON)JSONObject.parse(strUser),UserDto.class);
//        System.out.println(userDto.getAge());
//
//        System.out.println(JSON.parseObject(strUser));;
//
//        System.out.println(JSONObject.parseObject(strUser,UserDto.class));;


//        String strUser = JSON.toJSONString(user0);
//        System.out.println(JSONObject.toJSONString(user0));;
//        //字符串转对象  用JSON转
//        System.out.println(JSON.parseObject(strUser,UserDto.class));;
//
//        //用JSONObject转
//        System.out.println(JSONObject.parseObject(strUser,UserDto.class));;
//
//        //字符串转map 用JSON转
//        Map map = (Map)JSON.parse(strUser);
//        System.out.println(map.get("name"));
//
//        Map map1 = (Map)JSONObject.parse(strUser);
//        System.out.println(map1.get("name"));



        //===========================================================分割线



        UserDto user0 = new UserDto();
        user0.setName("tom");
        user0.setAge("11");

        UserDto user1 = new UserDto();
        user1.setName("jack");
        user1.setAge("12");

        List<UserDto> list = new ArrayList<UserDto>();
        list.add(user0);
        list.add(user1);

        //将list转为string
        System.out.println(JSON.toJSONString(list));
        System.out.println(JSONObject.toJSONString(list));

        //将list集合转化为数组
        JSONArray arr = (JSONArray)JSONObject.toJSON(list);
        System.out.println(arr);

        JSONArray arr1 = (JSONArray)JSON.toJSON(list);
        System.out.println(arr1);

        arr1.forEach(item->{
            Map map = (Map)item;
            System.out.println(map.get("name"));
        });

        //将JSONArray转化为对象数组
        List<UserDto> list1 = JSON.parseArray(arr1.toJSONString(),UserDto.class);
        System.out.println(list1);

        List<UserDto> list2 = JSONObject.parseArray(arr1.toJSONString(),UserDto.class);
        System.out.println(list2);


        System.out.println(JSON.toJavaObject((JSON)JSON.toJSON(arr.get(0)),UserDto.class));


        String str = JSON.toJSONString(list);
        List<UserDto> list3 = JSONObject.parseArray(str,UserDto.class);
        System.out.println(list3);

        List<Map> list4 = JSONObject.parseArray(str,Map.class);
        System.out.println(list4);

//        JSONObject.parseObject()

    }
}
