package com.test.thread1;

/**
 * Created by Administrator on 2017/1/17.
 */
public class ThreadForSleep extends Thread{

    @Override
    public void run(){
        try {
            System.out.println("run threadName="+this.currentThread().getName()+"begin");
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName()+"end");
            //获取name和获取Id
            //System.out.println("run threadName="+this.getName()+"and"+this.getId() );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }







}
