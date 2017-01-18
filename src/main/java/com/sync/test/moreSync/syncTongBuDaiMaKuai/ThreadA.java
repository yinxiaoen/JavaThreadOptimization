package com.sync.test.moreSync.syncTongBuDaiMaKuai;

/**
 * Created by Administrator on 2017/1/18.
 */
public class ThreadA extends Thread{
    private ObjectService service;
    public ThreadA(ObjectService service)
    {
        super();
        this.service=service;
    }
    @Override
    public void run(){
        super.run();
        service.serviceMethod();
    }
}
