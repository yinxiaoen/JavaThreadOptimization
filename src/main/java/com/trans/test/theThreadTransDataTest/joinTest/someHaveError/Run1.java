package com.trans.test.theThreadTransDataTest.joinTest.someHaveError;

/**
 * Created by Administrator on 2017/1/22.
 */
public class Run1 {
    public  static void main(String[] args)
    {
        ThreadB b=new ThreadB();
        ThreadA a=new ThreadA(b);
        a.start();
        b.start();
        try {
            b.join();
            System.out.println("main end"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
