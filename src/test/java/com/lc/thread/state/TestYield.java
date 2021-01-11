package com.lc.thread.state;


//测试线程礼让
// 礼让不一定成功，看CPU心情
public class TestYield {
    public static void main(String[] args) {
        Yield yield =new Yield();
        new Thread(yield,"a").start();
        new Thread(yield,"b").start();
    }

}

class Yield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程停止执行");
    }
}
