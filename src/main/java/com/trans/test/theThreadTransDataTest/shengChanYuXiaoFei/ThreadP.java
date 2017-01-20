package com.trans.test.theThreadTransDataTest.shengChanYuXiaoFei;

/**
 * Created by Administrator on 2017/1/20.
 */
public class ThreadP extends Thread {
    private P p;
    public ThreadP(P p){
        super();
        this.p=p;
    }
    @Override
    public void run(){
        while(true){
            p.setValue();
        }
    }
}
