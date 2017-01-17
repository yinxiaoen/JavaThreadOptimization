package com.test.stopThread;

/**
 * Created by Administrator on 2017/1/17.
 * interrupt不会停止正在运行的线程
 */
public class stopByInterruptTest {
    public static  void main(String []args){
        stopByInterrupt stopByInterrupt=new stopByInterrupt();
        stopByInterrupt.start();
        stopByInterrupt.interrupt();
    }
}
