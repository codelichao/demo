package com.lc.thread.Callable;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

//线程创建方式三：实现callable接口
/*
优点：1.可以定义返回值
     2.可以抛出异常
 */
public class TestCallable implements Callable<Boolean> {

    private String url;//网络图片地址
    private String name;//保存得文件名

    public TestCallable(String url,String name){
        this.url=url;
        this.name = name ;
    }

    //下载图片的执行体
    @Override
    public Boolean call(){
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为"+name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3363295869,2467511306&fm=26&gp=0.jpg","1.jpg");
        TestCallable t2 = new TestCallable("https://dss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1819216937,2118754409&fm=26&gp=0.jpg","2.jpg");
        TestCallable t3 = new TestCallable("https://dss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2771978851,2906984932&fm=26&gp=0.jpg","3.jpg");
        //创建执行服务：
        ExecutorService ser = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> r1 = ser.submit(t1);
        Future<Boolean> r2 = ser.submit(t2);
        Future<Boolean> r3 = ser.submit(t3);

        //获取结果
        Boolean rs1 =r1.get();
        Boolean rs2 =r2.get();
        Boolean rs3 =r3.get();

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);

        //关闭服务
        ser.shutdownNow();
    }


}


//下载器
class WebDownloader{
    //下载方法
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("io异常");
        }
    }
}

