package CaseThread;

public class ThreadTest {

    //http://yuedu.163.com/book_reader/707aa1947b8b4ad797e871ccd8d2de28_4
    public static void main(String[] args) throws InterruptedException {

//        MyThread myThread = new MyThread();
//
//        myThread.start();
//
//        Thread.sleep(1000);
//        System.out.println(Thread.currentThread());
//        System.out.println("main");


        MyRunnable my = new MyRunnable();
        Thread thread = new Thread(my);
        thread.start();

        System.out.println("main");

    }
}
