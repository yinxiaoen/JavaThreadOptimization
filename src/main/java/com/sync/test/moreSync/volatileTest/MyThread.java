package com.sync.test.moreSync.volatileTest;

/**
 * Created by Administrator on 2017/1/19.
 */
public class MyThread extends Thread
{
   volatile public static int count;
    //private static void addCount(){
   // synchronized static void addCount(){
        synchronized  void addCount(){
        for (int i=0;i<100;i++)
        {
            count++;
        }
        System.out.println("count="+count);
    }
    @Override
    public void run()
    {
        addCount();
    }
}
