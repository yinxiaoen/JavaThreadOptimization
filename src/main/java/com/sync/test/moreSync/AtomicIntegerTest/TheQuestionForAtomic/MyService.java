package com.sync.test.moreSync.AtomicIntegerTest.TheQuestionForAtomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Administrator on 2017/1/19.
 */
public class MyService {
    public static AtomicLong aiRef=new AtomicLong();
    public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加了100以后的值是："+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }

}
