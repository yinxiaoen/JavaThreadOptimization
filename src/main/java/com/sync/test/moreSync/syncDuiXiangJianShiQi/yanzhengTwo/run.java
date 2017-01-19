package com.sync.test.moreSync.syncDuiXiangJianShiQi.yanzhengTwo;

/**
 * Created by Administrator on 2017/1/19.
 * 当其他线程执行x对象中的sync同步方法的时候呈现同步状态
 */
public class run {
    public static void main(String[] args){
        try {
            Service service=new Service();
            MyObject object=new MyObject();
            ThreadA a =new ThreadA(service,object);
            a.setName("a");
            a.start();
            Thread.sleep(100);
            ThreadB b=new ThreadB(object);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
