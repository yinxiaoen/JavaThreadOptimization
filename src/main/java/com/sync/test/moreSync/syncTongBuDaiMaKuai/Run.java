package com.sync.test.moreSync.syncTongBuDaiMaKuai;

/**
 * Created by Administrator on 2017/1/18.
 */
public class Run {
    public static void main(String [] args){
        ObjectService service=new ObjectService();
        ThreadA a=new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
