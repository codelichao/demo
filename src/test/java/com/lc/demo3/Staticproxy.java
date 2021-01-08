package com.lc.demo3;

//静态代理   婚庆公司
public class Staticproxy {

    public static void main(String[] args) {

        WeddingCompany weddingCompany = new WeddingCompany();
        weddingCompany.marry();
    }

}

interface Marry {
    void marry();
}

//真实角色，小王结婚
class XiaoWang implements Marry {

    @Override
    public void marry() {
        System.out.println("小王结婚");
    }
}

class WeddingCompany implements Marry {

    @Override
    public void marry() {
        before();
        System.out.println("结婚");
        after();
    }

    private void after() {
        System.out.println("婚前准备");
    }

    private void before() {
        System.out.println("婚后结算");
    }
}
