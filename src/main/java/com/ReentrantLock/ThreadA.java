package com.ReentrantLock;

/**
 * Created by Administrator on 2017/2/3.
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService service)
    {
        super();
        this.myService=service;
    }
    @Override
    public void run(){
        myService.methodA();
    }
}
