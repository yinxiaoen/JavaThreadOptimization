package com.sync.test.moreSync;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Run
{
    public static void main(String[] args)
    {
        HasSelfPrivateNum numRef1=new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2=new HasSelfPrivateNum();
        ThreadA threadA=new ThreadA(numRef1);
        threadA.start();
        ThreadB threadB=new ThreadB(numRef2);
        threadB.start();
    }
}
