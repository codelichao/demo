package com.lc.thread.StaticProxy;

//静态代理   婚庆公司
//总结：真实对象和代理对象同时实现同一个接口,代理对象要代理真实角色
//优点：代理对象可以帮助真实对象做事情，真实对象只需要关注自己的主要事情
public class Staticproxy {

    public static void main(String[] args) {

        new Thread(()->System.out.println("i love you")).start();
        new WeddingCompany(new XiaoWang()).marry();
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


//代理角色
class WeddingCompany implements Marry {

    //代理--》真实角色
    private Marry target;

    public WeddingCompany(Marry target){
        this.target=target;
    }

    @Override
    public void marry() {
        before();
        target.marry();
        after();
    }

    private void before() {
        System.out.println("婚前准备");
    }

    private void after() {
        System.out.println("婚后结算");
    }
}
