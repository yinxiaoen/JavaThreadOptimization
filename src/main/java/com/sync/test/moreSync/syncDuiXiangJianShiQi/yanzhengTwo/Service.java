package com.sync.test.moreSync.syncDuiXiangJianShiQi.yanzhengTwo;

/**
 * Created by Administrator on 2017/1/19.
 */
public class Service{
    public void testMethod1(MyObject object){
        synchronized (object){
            try {
                System.out.println("testMethod1_getLock time="+System.currentTimeMillis()+"run ThreadName="+Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod1 releaseLock time="+System.currentTimeMillis()+"run ThreadName="+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}