package com.sync.test.moreSync.syncSuoChongRu;

import com.test.threadForSynchronized.*;

/**
 * Created by Administrator on 2017/1/18.
 */
public class Run {
    public  static void main(String[] args)
    {
        MyThread t=new MyThread();
        t.start();
    }
}
