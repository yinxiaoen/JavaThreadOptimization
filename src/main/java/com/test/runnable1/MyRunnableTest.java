package com.test.runnable1;


/**
 * Created by Administrator on 2017/1/16.
 */
public class MyRunnableTest {
    public static void main(String []args){
        Runnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
