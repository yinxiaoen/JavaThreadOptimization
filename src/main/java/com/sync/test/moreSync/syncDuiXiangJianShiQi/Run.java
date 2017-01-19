package com.sync.test.moreSync.syncDuiXiangJianShiQi;

/**
 * Created by Administrator on 2017/1/18.
 */
public class Run {
    public static  void main(String[] args)
    {
        Service service=new Service();
        Thread a =new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
