package com.test.stopThread.stopIt;

/**
 * Created by Administrator on 2017/1/17.
 */
public class stopThreadByInterrupted extends Thread{
    @Override

        public void run(){
        try{
            super.run();
            for(int i=0;i<50000;i++){
                if(this.interrupted()){
                    System.out.println("我已经停止了");
                    throw new IllegalStateException();
                   // break;
                }
                System.out.println("i="+(i+1));

            }

            System.out.println("停止了我还是出来了");
        }catch(Exception  e){

        }
        }


}
