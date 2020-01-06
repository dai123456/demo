package caseStream.demo04MethedReference;

public class ObjectSub extends ObjectSuper{

    @Override
    public void testSuper() {
        System.out.println("覆盖父类的方法");
    }

    public void method(TestSupInterface supInterface){
        supInterface.show();

    }

    public void show(){
//        method(name->{
//            ObjectSuper super1 = new ObjectSuper();
//            super1.testSuper();
//        });

        /**
         * 因为有父子关系，所以存在一个关键字super代表父类，所以可以直接
         * 使用super调用父类的成员方法
         */
//        method(()->super.testSuper());
//        method(name->super::testSuper);
        method(super::testSuper);

    }

    public static void main(String[] args) {
        new ObjectSub().show();
    }

}
