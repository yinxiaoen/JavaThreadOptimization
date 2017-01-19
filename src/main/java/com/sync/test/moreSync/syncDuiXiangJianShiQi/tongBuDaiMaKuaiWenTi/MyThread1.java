package com.sync.test.moreSync.syncDuiXiangJianShiQi.tongBuDaiMaKuaiWenTi;

/**
 * Created by Administrator on 2017/1/19.
 */
public class MyThread1 extends Thread {
    private MyOneList list;
    public MyThread1(MyOneList list)
    {
        super();
        this.list=list;
    }
    @Override
    public void run(){
        MyService msRef=new MyService();
        msRef.addServiceMethod(list,"A");
    }
}
