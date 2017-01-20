package com.trans.test.theThreadTransDataTest.OneToOneTest;

/**
 * Created by Administrator on 2017/1/20.
 */
public class C_Thread extends Thread {
    private C r;

    public C_Thread(C r){
        super();
        this.r=r;
    }
    @Override
    public void run(){
        while(true){
            r.popService();
        }
    }
}
