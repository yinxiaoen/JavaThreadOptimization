package com.sync.test.moreSync.AtomicIntegerTest.TheQuestionForAtomic;

import com.test.threadForSynchronized.*;

/**
 * Created by Administrator on 2017/1/19.
 */
public class Run {
    public static void main(String[] args){
        try {
            MyService service=new MyService();
            MyThread[] array=new MyThread[5];
            for(int i=0;i<array.length;i++){
                array[i]=new MyThread(service);
            }
            for(int i=0;i<array.length;i++){
                Thread.sleep(5000);
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
