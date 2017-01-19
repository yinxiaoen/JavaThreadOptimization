package com.sync.test.moreSync.syncDuiXiangJianShiQi.jiejuesixunhuan;

/**
 * Created by Administrator on 2017/1/19.
 */
public class Run {
    public static void main(String[]args){
        PrintString printStringService=new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止它！stopThread="+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printStringService.setContinuePrint(false);

    }
}
