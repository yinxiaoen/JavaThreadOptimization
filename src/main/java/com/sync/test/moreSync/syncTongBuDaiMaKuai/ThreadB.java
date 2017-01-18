package com.sync.test.moreSync.syncTongBuDaiMaKuai;

/**
 * Created by Administrator on 2017/1/18.
 */
public class ThreadB extends Thread{
    private ObjectService service;
    public ThreadB(ObjectService service)
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
