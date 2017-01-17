package com.test.stopThread;

/**
 * Created by Administrator on 2017/1/17.
 */
public class stopByInterrupt extends Thread{
    @Override
    public void run(){
        super.run();
        for(int i=0;i<50000;i++){
            System.out.println("i="+(i+1));
        }
    }
}
