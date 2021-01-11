package com.lc.thread.state;

//测试线程的优先级
//优先级高并不意味着优先执行，只是先被执行的概率大
public class TestPriority {
    public static void main(String[] args) {
        //主线程默认优先级
        System.out.println(Thread.currentThread().getName() + "-->" + Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();
        Thread t1 = new Thread(myPriority,"t1");
        Thread t2 = new Thread(myPriority,"t2");
        Thread t3 = new Thread(myPriority,"t3");

        t1.setPriority(1);
        t1.start();
        t1.getPriority();

        t2.setPriority(10);
        t2.start();
        t2.getPriority();

        t3.setPriority(5);
        t3.start();
        t3.getPriority();


    }
}


class MyPriority implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-->" + Thread.currentThread().getPriority());
    }
}
