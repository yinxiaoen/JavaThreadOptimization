package com.test.thread1;

/**
 * Created by Administrator on 2017/1/17.
 */
public class ThreadForSleepTest {
    public static void main(String []args)
    {
        ThreadForSleep threadForSleep=new ThreadForSleep();
        System.out.println("begin ="+System.currentTimeMillis());
    /*    begin =1484620319317
        run threadName=mainbegin
        run threadName=mainend
        end =1484620321317*/
       // threadForSleep.run();


      /*  begin =1484620380738
        end =1484620380739
        run threadName=Thread-0begin
        run threadName=Thread-0end*/
        threadForSleep.start();
        System.out.println("end ="+System.currentTimeMillis());
    }
}
