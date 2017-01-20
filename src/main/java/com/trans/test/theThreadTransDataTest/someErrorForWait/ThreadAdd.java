package com.trans.test.theThreadTransDataTest.someErrorForWait;

/**
 * Created by Administrator on 2017/1/20.
 */
public class ThreadAdd extends Thread {
    private Add p;
    public ThreadAdd(Add p){
        super();
        this.p=p;
    }
    @Override
    public void run(){
        p.add();
    }
}
