package com.test.stopThread;

/**
 * Created by Administrator on 2017/1/17.
 */
public class stopForExpection extends Thread{
    @Override
    public void run(){
        super.run();
        for(int i=0;i<50000;i++){
            try {
                this.stop();
            }catch(ThreadDeath e){
                e.printStackTrace();
            }
        }
    }
}
