package com.test.thread1;

/**
 * Created by Administrator on 2017/1/16.
 */
public class ThreadForTestRun extends Thread {
    private  int i;
    public  ThreadForTestRun(int i){
        super();
        this.i=i;
    }
    @Override
    public void run()
    {
        System.out.println(i);
    }
}
