package com.lc.thread.state;


import java.text.SimpleDateFormat;
import java.util.Date;


//每个线程都有一个锁，sleep不会释放锁
//模拟倒计时
public class TestSleep2 {

    public static void main(String[] args) {

        Date date = new Date(System.currentTimeMillis());

        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
                date = new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    //模拟倒计时
    public static void tenDown() throws InterruptedException {
        int num = 10;

        while (true) {
            Thread.sleep(1000);
            System.out.println(num--);
            if (num <= 0) {
                break;
            }
        }
    }
}
