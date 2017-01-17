package com.test.stopThread;

/**
 * Created by Administrator on 2017/1/17.
 */
public class InterruptedTest {
    public static void main(String []args){
        try {
            stopByInterrupt stopByInterrupt=new stopByInterrupt();
            stopByInterrupt.start();
            stopByInterrupt.interrupt();
           // System.out.println(stopByInterrupt.getName()+"是否停止线程="+ stopByInterrupt.interrupted());
            System.out.println(stopByInterrupt.getName()+"是否停止线程="+ stopByInterrupt.isInterrupted());
        }catch (Exception e){

        }


    }
}
