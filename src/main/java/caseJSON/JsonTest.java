package caseJSON;

import com.alibaba.fastjson.JSONObject;

public class JsonTest {

    //psvm快捷键
    public static void main(String[] args) {
        //采用com.alibaba.fastjson.JSONObject工具类
        //字符串转json
        JSONObject jsonO;
        //json的字符串格式 属性用双引号包住，双引号由右斜杠（\）转义
        //纯粹的字符串格式
        String strJson = "{\"name\":\"tom\"}";
        jsonO = JSONObject.parseObject(strJson);
        System.out.println("============"+jsonO);

//        String arrJson = "{\"list\":[{\"name\":\"tom\",\"age\":\"12\",\"sex\":\"male\"}]}";
        String arrJson = "{\"list\":[{\"name\":\"tom\",\"age\":\"12\",\"sex\":\"male\"}," +
                "{\"name\":\"tom\",\"age\":\"12\",\"sex\":\"male\"}]}";
        jsonO = JSONObject.parseObject(arrJson);
        System.out.println("============"+jsonO);

        String combinationJson = "{\"name\":\"tom\"," +
                "\"list\":[{\"name\":\"tom\",\"age\":\"12\",\"sex\":\"male\"}]}";

        jsonO = JSONObject.parseObject(combinationJson);
        System.out.println("============"+jsonO);

        byte[] bytei = new byte[]{'a','b','c'};




    }
}
