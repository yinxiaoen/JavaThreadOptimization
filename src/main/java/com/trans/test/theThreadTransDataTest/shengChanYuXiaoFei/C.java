package com.trans.test.theThreadTransDataTest.shengChanYuXiaoFei;

/**
 * Created by Administrator on 2017/1/20.
 */
public class C {
    private String lock;
    public C(String lock){
        super();
        this.lock=lock;
    }
    public void getValue(){
        synchronized (lock){
            if(ValueObject.value.equals(""))
            {
                try {
                    lock.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("get的值是"+ValueObject.value);
            ValueObject.value="";
            lock.notify();
        }
    }

}
