package com.test.stopThread;

import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/1/17.
 */
public class returnToStop extends Thread{
    @Override
    public void run(){

        for(int i=0;i<50000;i++){
            if(this.interrupted())
            {
                System.out.println("i="+(i+1));
                System.out.println("停止了");
                return ;
            }
        }
          System.out.println("我还没停止呢");
    }
}
