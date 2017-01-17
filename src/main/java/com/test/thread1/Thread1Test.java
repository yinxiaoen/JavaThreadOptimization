package com.test.thread1;

/**
 * Created by Administrator on 2017/1/16.
 */
public class Thread1Test
{
    public  static void main(String [] args ){
        Thread1 thread1=new Thread1();
        thread1.start();;
        System.out.println("运行结束");
    }
}
