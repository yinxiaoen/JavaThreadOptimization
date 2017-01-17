package com.test.thread1;

/**
 * Created by Administrator on 2017/1/16.
 */
public class CountOperateTest {
    public static void main(String [] args){
        CountOperate c=new CountOperate();
     /*   c.setName("A");
        c.start();*/
     /*   CountOperate--------begin
        Thread.currentThread().getName()=main
        this.getName()=Thread-0
        CountOperate--------end
        run--------begin
        Thread.currentThread().getName()=A
        this.getName()=A
        run--------end*/
        Thread thread=new Thread(c,"A");
        thread.start();

        /*CountOperate--------begin
        Thread.currentThread().getName()=main
        this.getName()=Thread-1
        CountOperate--------end
        run--------begin
        Thread.currentThread().getName()=A
        this.getName()=Thread-1
        run--------end*/

    }
}
