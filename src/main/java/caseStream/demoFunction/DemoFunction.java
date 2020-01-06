package caseStream.demoFunction;

public class DemoFunction {

    public static void show(DemoFunctionInterface demo){
        demo.demoFunction();
    }

    public static void main(String[] args) {
        show(new DemoFunctionInterfaceImpl());

        show(new DemoFunctionInterface() {
            @Override
            public void demoFunction() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        show(()->
            System.out.println("使用lambda表达式重写接口中的抽象方法")
        );

    }


}
