package com.test.stopThread;

/**
 * Created by Administrator on 2017/1/17.
 */
public class returnToStopTest {
    public static void main(String []args){
        try {
            returnToStop returnToStop=new returnToStop();
            returnToStop.start();
            Thread.sleep(10000);
            returnToStop.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
