package com.sync.test.moreSync.syncTongBuDaiMaKuai;

/**
 * Created by Administrator on 2017/1/18.
 * 此处用同步代码块解决代码的同步问题
 */
public class ObjectService {
    public void serviceMethod()
    {
        synchronized (this){
            try {
                System.out.println("begin time="+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end end="+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
