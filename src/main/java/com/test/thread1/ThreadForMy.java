package com.test.thread1;

/**
 * Created by Administrator on 2017/1/16.
 */
public class ThreadForMy extends Thread {
    @Override
    public void  run(){
        try {
                for(int i=0; i<10; i++){
                    int time =(int) (Math.random() * 1000);
                    Thread.sleep(time);
                    System.out.println("run=" +Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}
