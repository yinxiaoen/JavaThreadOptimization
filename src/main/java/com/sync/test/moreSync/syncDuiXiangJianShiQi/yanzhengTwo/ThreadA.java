package com.sync.test.moreSync.syncDuiXiangJianShiQi.yanzhengTwo;

import com.test.suspendAndResume.*;

/**
 * Created by Administrator on 2017/1/19.
 */
public class ThreadA extends Thread {
    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object){
        super();
        this.service=service;
        this.object=object;
    }
    @Override
    public void run(){
        super.run();
        service.testMethod1(object);
    }
}
