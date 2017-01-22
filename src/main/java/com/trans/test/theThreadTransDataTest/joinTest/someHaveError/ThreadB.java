package com.trans.test.theThreadTransDataTest.joinTest.someHaveError;

/**
 * Created by Administrator on 2017/1/22.
 */
public class ThreadB extends Thread {
    @Override
    synchronized public void run(){
        try {
            System.out.println("begin B ThreadName="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("begin B ThreadName="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
