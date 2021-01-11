package com.lc.thread.Lambda;

public class TestLambda2 {

    static class Love2 implements ILove {

        @Override
        public void love(int a) {
            System.out.println("I Love You:" + a);
        }
    }


    public static void main(String[] args) {
        ILove love = new Love();
        love.love(1);

        //静态内部类
        love = new Love2();
        love.love(2);

        //局部内部类
        class Love3 implements ILove {

            @Override
            public void love(int a) {
                System.out.println("I Love You:" + a);
            }
        }
        love = new Love3();
        love.love(3);

        //匿名内部类
        love = new ILove() {
            @Override
            public void love(int a) {
                System.out.println("I Love You:" + a);
            }
        };
        love.love(4);

        //lambda
        love = (int a) -> {
            System.out.println("I Love You:" + a);
        };
        love.love(5);

        //lambda简化：去掉参数类型
        love = (a) -> {
            System.out.println("I Love You:" + a);
        };
        love.love(6);

        //lambda简化：去掉()
        love = a -> {
            System.out.println("I Love You:" + a);
        };
        love.love(7);

        //lambda简化：去掉{}
        love = a -> System.out.println("I Love You:" + a);

        love.love(8);
    }
}

interface ILove {
    void love(int a);
}

class Love implements ILove {

    @Override
    public void love(int a) {
        System.out.println("I Love You:" + a);
    }
}
