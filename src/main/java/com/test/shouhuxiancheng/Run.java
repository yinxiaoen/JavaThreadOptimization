package com.test.shouhuxiancheng;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Run
{
    public static void main(String[] args)
    {
        try{
            MyThread thread=new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开时打印也就停止了");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
