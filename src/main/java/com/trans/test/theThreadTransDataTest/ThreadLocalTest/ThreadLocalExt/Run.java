package com.trans.test.theThreadTransDataTest.ThreadLocalTest.ThreadLocalExt;

/**
 * Created by Administrator on 2017/1/23.
 */
public class Run {
    public static ThreadLocalExt t1=new ThreadLocalExt();
    public static void main(String[] args){
        if(t1.get() == null ){
            System.out.println("从未放入值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
