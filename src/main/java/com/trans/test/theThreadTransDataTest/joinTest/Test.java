package com.trans.test.theThreadTransDataTest.joinTest;

/**
 * Created by Administrator on 2017/1/22.
 */
public class Test {
    public static void main(String[] args){
       MyThread threadTest=new MyThread();
       threadTest.start();
        try {
            threadTest.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我想当threadtest对象执行完后在执行");
       System.out.println("单上面的值写多少不确定");
       System.out.println("根本不确定");
    }
}
