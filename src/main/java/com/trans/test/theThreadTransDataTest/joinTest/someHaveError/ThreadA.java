package com.trans.test.theThreadTransDataTest.joinTest.someHaveError;

/**
 * Created by Administrator on 2017/1/22.
 */
public class ThreadA extends Thread {
    private ThreadB b;
    public ThreadA(ThreadB b)
    {
        super();
        this.b=b;
    }
    @Override
    synchronized public void run(){
        try {
            synchronized (b)
            {
                System.out.println("begin A ThreadName="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("begin A ThreadName="+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
