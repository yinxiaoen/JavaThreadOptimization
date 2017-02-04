package com.trans.test.theThreadTransDataTest.ThreadLocalTest.ThreadLocalExt;

/**
 * Created by Administrator on 2017/1/23.
 */
public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected  Object initialValue(){
        return "我是默认值 第一次get不在为null";
    }
}
