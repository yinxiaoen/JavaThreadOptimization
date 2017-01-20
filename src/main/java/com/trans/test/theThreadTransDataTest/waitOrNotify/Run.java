package com.trans.test.theThreadTransDataTest.waitOrNotify;

import com.sync.test.moreSync.syncTongBuDaiMaKuai.*;

/**
 * Created by Administrator on 2017/1/20.
 */
public class Run {
    public static void main(String[] args){
        try {
            Object lock=new Object();
            ThreadA a=new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            ThreadB b=new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
