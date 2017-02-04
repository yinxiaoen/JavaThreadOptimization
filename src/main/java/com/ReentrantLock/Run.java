package com.ReentrantLock;

/**
 * Created by Administrator on 2017/2/3.
 */
public class Run {
    public static void main(String[] args){
        MyService service=new MyService();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadAA aa=new ThreadAA(service);
        aa.setName("AA");
        aa.start();
        ThreadB b=new ThreadB(service);
        b.start();
        ThreadBB bb=new ThreadBB(service);
        bb.start();
    }
}
