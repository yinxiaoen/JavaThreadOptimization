package com.sync.test.moreSync.syncSuoChongRu;

/**
 * Created by Administrator on 2017/1/18.
 */
public class Service {
    synchronized public void service1()
    {
        System.out.println("service1");
        service2();
    }
    synchronized public void service2()
    {
        System.out.println("service2");
        service3();
    }
    synchronized public void service3()
    {
        System.out.println("service3");
    }
}
