package com.trans.test.theThreadTransDataTest.OneToOneTest;


/**
 * Created by Administrator on 2017/1/20.
 */
public class P_Thread extends Thread {
    private P p;
    public P_Thread(P p){
        super();
        this.p=p;
    }
    @Override
    public void run(){
        while(true){
            p.pushService();
        }
    }
}
