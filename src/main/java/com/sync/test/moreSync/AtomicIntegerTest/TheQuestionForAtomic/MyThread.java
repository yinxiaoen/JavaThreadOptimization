package com.sync.test.moreSync.AtomicIntegerTest.TheQuestionForAtomic;

/**
 * Created by Administrator on 2017/1/19.
 */
public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService myService){
        super();
        this.myService=myService;
    }
    @Override
    public void run(){

        myService.addNum();
    }
}
