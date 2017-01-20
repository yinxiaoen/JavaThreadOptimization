package com.trans.test.theThreadTransDataTest.someErrorForWait;

/**
 * Created by Administrator on 2017/1/20.
 */
public class ThreadSubtract extends Thread {
    private Subtract r;
    public ThreadSubtract(Subtract r){
        super();
        this.r=r;
    }
    @Override
    public void run(){
        r.subtract();
    }
}
