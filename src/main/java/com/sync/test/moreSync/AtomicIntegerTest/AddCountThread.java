package com.sync.test.moreSync.AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2017/1/19.
 */
public class AddCountThread extends Thread {
    private AtomicInteger count =new AtomicInteger(0);
    @Override
    public void run(){
        for(int i=0;i<10000;i++){
            System.out.println(count.incrementAndGet());
        }
    }
}
