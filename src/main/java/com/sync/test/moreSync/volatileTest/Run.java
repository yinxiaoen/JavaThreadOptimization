package com.sync.test.moreSync.volatileTest;

/**
 * Created by Administrator on 2017/1/19.
 */
public class Run {
    public static void main(String[] args)
    {
        MyThread[] myThreadArray =new MyThread[100];
        for(int i=0;i<100;i++){
            myThreadArray[i]=new MyThread();
        }
        for(int i=0;i<100;i++){
            myThreadArray[i].start();
        }
    }
}
