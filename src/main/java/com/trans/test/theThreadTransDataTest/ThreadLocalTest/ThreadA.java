package com.trans.test.theThreadTransDataTest.ThreadLocalTest;

/**
 * Created by Administrator on 2017/1/22.
 */
public class ThreadA extends Thread {
    @Override
        public void run(){
        try {

            for(int i=0;i<100;i++)
            {
                Tools.t1.set("ThreadA"+(i+1));
                System.out.println("ThreadA get Value="+Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}
