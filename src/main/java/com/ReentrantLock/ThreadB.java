package com.ReentrantLock;

/**
 * Created by Administrator on 2017/2/3.
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService service)
    {
        super();
        this.myService=service;
    }
    @Override
    public void run(){
        myService.methodA();
    }
}
