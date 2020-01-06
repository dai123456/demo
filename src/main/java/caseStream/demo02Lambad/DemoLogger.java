package caseStream.demo02Lambad;

public class DemoLogger {

    //定义一个显示日志的方法，方法的参数传递日志的等级和messageBuilder接口
    public static void showLog(int level,MessageBuilder mb){

        if(level == 1){
            System.out.println(mb.builderMessage("123"));
        }

    }

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        showLog(1,(name)->{
            if(name.equals("123")){
                return msg1+msg2+msg3;
            }else{
                return name;
            }
        });
    }



}
