package com.sync.test.moreSync.syncDuiXiangJianShiQi;

/**
 * Created by Administrator on 2017/1/18.
 */
public class ThreadB extends  Thread
{
    private Service service;
    public ThreadB(Service service)
    {
        super();
        this.service=service;
    }
    @Override
    public void run(){
        service.setUsernamePassword("b","bb");
    }
}
