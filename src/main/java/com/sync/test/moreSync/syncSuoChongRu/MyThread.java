package com.sync.test.moreSync.syncSuoChongRu;

/**
 * Created by Administrator on 2017/1/18.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        Service service =new Service();
        service.service1();
    }
}
