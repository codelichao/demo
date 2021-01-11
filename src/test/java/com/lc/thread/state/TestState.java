package com.lc.thread.state;

//观察测试线程的状态
public class TestState {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("///////////");
        });

        //观察创建后状态
        Thread.State state = thread.getState();
        System.out.println(state);//NEW

        //观察启动后
        thread.start();
        state = thread.getState();
        System.out.println(state);//RUN


        while(state!=Thread.State.TERMINATED){//只要线程不终止，一直打印状态
            Thread.sleep(1000);
            state = thread.getState();
            System.out.println(state);
        }

        //thread.start(); //线程不能重新启动
    }
}
