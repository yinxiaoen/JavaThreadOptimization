package com.sync.test.moreSync.syncDuiXiangJianShiQi.tongBuDaiMaKuaiWenTi;

import com.test.threadForSynchronized.MyThread;

/**
 * Created by Administrator on 2017/1/19.
 */
public class Run {
    public static  void main(String []args)
    {
        MyOneList list=new MyOneList();
        MyThread1 thread1=new MyThread1(list);
        thread1.setName("A");
        thread1.start();
        MyThread2 thread2=new MyThread2(list);
        thread2.setName("B");
        thread2.start();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("listSize="+list.getSize());

    }
}
