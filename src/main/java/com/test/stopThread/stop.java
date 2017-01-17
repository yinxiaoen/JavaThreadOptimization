package com.test.stopThread;

/**
 * Created by Administrator on 2017/1/17.
 */
public class stop extends Thread
{
    private int i=0;
    @Override
    public void run(){
        try {
            while(true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
