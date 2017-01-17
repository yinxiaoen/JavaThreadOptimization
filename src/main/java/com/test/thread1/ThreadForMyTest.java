package com.test.thread1;

/**
 * Created by Administrator on 2017/1/16.
 */
public class ThreadForMyTest {
    public static void main(String [] args){
        try {
            ThreadForMy threadForMy=new ThreadForMy();
            threadForMy.setName("myThread");
            threadForMy.start();
            for (int i=0;i<10;i++){
                int time=(int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

