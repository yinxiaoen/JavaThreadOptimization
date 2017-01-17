package com.test.thread1;

/**
 * Created by Administrator on 2017/1/16.
 */
public class ThreadForMain extends Thread{
    public  ThreadForMain()
    {
        System.out.println("构造方法的打印："+ThreadForMain.currentThread().getName());
    }
    public void run()
    {
        System.out.println("run方法的打印："+ThreadForMain.currentThread().getName());
    }
}
