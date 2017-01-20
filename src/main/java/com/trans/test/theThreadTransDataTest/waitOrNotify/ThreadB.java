package com.trans.test.theThreadTransDataTest.waitOrNotify;

import static java.lang.Thread.sleep;

/**
 * Created by Administrator on 2017/1/20.
 */
public class ThreadB extends Thread {
    private Object lock;
    public ThreadB(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run(){
        try {
        synchronized (lock){
            for (int i=0;i<10;i++){
                MyList.add();
                if(MyList.size()==5){
                    lock.notify();
                    System.out.println("已经发出通知");
                }
                System.out.println("添加了"+(i+1)+"个元素！");
                Thread.sleep(2000);
            }
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
