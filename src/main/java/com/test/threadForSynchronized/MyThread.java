package com.test.threadForSynchronized;

/**
 * Created by Administrator on 2017/1/16.
 */
public class MyThread extends Thread{
    public MyThread(){
        super();
    }
    private int count=5;
    @Override
    synchronized  public void run(){
        super.run();
        count--;
        System.out.println("由 "+this.currentThread().getName()+"计算,count="+count);
    }
}
