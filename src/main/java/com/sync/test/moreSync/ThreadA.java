package com.sync.test.moreSync;

/**
 * Created by Administrator on 2017/1/17.
 */
public class ThreadA extends Thread
{
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef)
    {
        super();
        this.numRef=numRef;
    }

    @Override
    public void run(){
        super.run();
        numRef.addI("a");
    }
}
