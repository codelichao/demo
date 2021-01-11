package com.lc.thread.state;


//测试join方法 插队
public class TestJoin implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("vip" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        //启动自己的线程
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        //main线程
        for (int i = 0; i < 500; i++) {
            if(i==200){
                thread.join();
            }
            System.out.println("main"+i);
        }
    }
}
