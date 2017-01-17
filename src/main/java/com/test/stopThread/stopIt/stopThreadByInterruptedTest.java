package com.test.stopThread.stopIt;

/**
 * Created by Administrator on 2017/1/17.
 */
public class stopThreadByInterruptedTest {
    public static void main(String []args)
    {
        stopThreadByInterrupted stopThreadByInterrupted=new stopThreadByInterrupted();
        stopThreadByInterrupted.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopThreadByInterrupted.interrupt();
    }
}
