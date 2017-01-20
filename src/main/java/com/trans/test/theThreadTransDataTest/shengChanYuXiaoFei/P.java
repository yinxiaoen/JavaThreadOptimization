package com.trans.test.theThreadTransDataTest.shengChanYuXiaoFei;

/**
 * Created by Administrator on 2017/1/20.
 *               生产者
 */
public class P {
    private String lock;
    public P(String lock){
        super();
        this.lock=lock;
    }
    public void setValue()
    {
        synchronized (lock){
            if(!ValueObject.value.equals("")) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
                String value=System.currentTimeMillis()+"_"+System.nanoTime();
                System.out.println("set 的值是"+value);
                ValueObject.value=value;
                lock.notify();
        }
    }
}
