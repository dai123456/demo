package caseStream.demo04MethedReference;

public class ObjectSelfMethod {

    public void selfMethod(){
        System.out.println("调用本类的方法");
    }

    public void testMethod(TestSupInterface sup){
        sup.show();
    }

    public void show(){

//        testMethod(()->{
//            this.selfMethod();
//        });
        /**
         * 用this使用方法引用；需在本类中的方法调用函数式方法
         * this表示类已经存在
         * selfMethod方法在本类中也已经存在
         * 所以可以使用方法引用
         *
         */
        testMethod(this::selfMethod);
    }

    public static void main(String[] args) {
        new ObjectSelfMethod().show();
    }

}
