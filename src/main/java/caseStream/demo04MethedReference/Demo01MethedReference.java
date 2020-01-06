package caseStream.demo04MethedReference;

/**
 * 方法引用：
 */
public class Demo01MethedReference {

    public static void testPrint(String name,Printable print){

        print.printttt(name);

    }

    public static Integer testStaticMethod(Integer num,StaticMethod sMethod){
        return sMethod.cacl(num);
    }

    public static void testSuperMethod(ObjectSub sub){

        sub.show();


    }

    public static void main(String[] args) {
        String str = "123";
        testPrint(str,(name)->{
            System.out.println(name);
        });
        //方法引用基本方式
        /**
         * 1:System.out对象时已经存在
         * 2：println方法也是已经存在
         * 所以可以使用方法引用来优化lambda表达式
         * 可以直接使用System.out方法直接引用println方法
         */
        testPrint(str,System.out::println);

        /**
         * 使用方法引用优化lambda
         * 1:对象是已经存在的ObjectMethod
         * 2:成员方法也是已经存在的testMethod
         * 所以可以使用对象名引用成员方法
         */
        ObjectMethod obj = new ObjectMethod();
        testPrint(str,obj::testMethod);

        Integer n = -10;
        Integer integer = testStaticMethod(n, (num) -> {
            return Math.abs(num);
        });

        /**
         * 使用方法引用优化lambda
         * 1:对象是已经存在
         * 2：静态方法也是存在的
         * 可以使用对象调用静态方法
         */
        Integer integer1 = testStaticMethod(n,Math::abs);
        System.out.println(integer1);
    }

}
