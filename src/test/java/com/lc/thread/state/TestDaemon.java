package com.lc.thread.state;


//测试守护线程
//上帝守护人
public class TestDaemon {

    public static void main(String[] args) {
        God god = new God();
        Person p = new Person();
        Thread thread = new Thread(god);
        thread.setDaemon(true); //默认false 表示用户线程，正常的线程都是用户线程。
        thread.start();
        new Thread(p).start();
    }
}


//上帝
class God implements Runnable{




    @Override
    public void run() {
        while (true){
            System.out.println("上帝守护人");
        }
    }
}

//人
class Person implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("活的开心");
        }
        System.out.println("GoodBye!----------------------------------------------------------------------------------------------------");
    }
}
