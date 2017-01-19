package com.sync.test.moreSync.syncDuiXiangJianShiQi.yanzhengTwo;

/**
 * Created by Administrator on 2017/1/19.
 */
public class MyObject {
    synchronized  public void speedPrintString(){
        System.out.println("speedPrintString_getLock time="+System.currentTimeMillis()+"run ThreadName="+Thread.currentThread().getName());
        System.out.println("-------------------------------------");
        System.out.println("speedPrintString releaseLock time="+System.currentTimeMillis()+"run ThreadName="+Thread.currentThread().getName());
    }
}
