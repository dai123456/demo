package caseStream.demo03Lambad;

import java.util.function.Consumer;

public class Demo03Consumer {

    public static void consumer(String name, Consumer<String> consumer){
        consumer.accept(name);
    }

    //谁写前面谁先消费
    public static void andther(String name,Consumer<String> con1,
                               Consumer<String> con2){
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
        consumer("jj",(name)->{
            System.out.println(name);
        });

        andther("jSon",(name)->{
            System.out.println(name.toUpperCase());
        },(name)->{
            System.out.println(name.toLowerCase());
        });

    }

}
