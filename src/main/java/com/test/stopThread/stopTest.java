package com.test.stopThread;

/**
 * Created by Administrator on 2017/1/17.
 */
public class stopTest {
    public static void main(String[] args)
    {
        try {
            stop stop=new stop();
            stop.start();
            Thread.sleep(8000);
            stop.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
