package com.lc.demo1;

//创建线程方式1：继承Thread类，重写run()方法，调用start并开启线程

//总结：线程开启不一定立即执行，由cpu调度执行
public class TestThread1 extends Thread{

    @Override
    public void run() {
        //run方法线程体
        for (int i =0;i<20;i++){
            System.out.println("我在看代码"+i);
        }
    }

    public static void main(String[] args) {
        //main线程，主线程

        //创建一个线程对象
        TestThread1 testThread1 = new TestThread1();

        //调用start()方法
        testThread1.start();


        for (int i =0;i<5;i++){
            System.out.println("我在学习多线程"+i);
        }
    }
}
