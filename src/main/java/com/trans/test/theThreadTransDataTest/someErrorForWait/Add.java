package com.trans.test.theThreadTransDataTest.someErrorForWait;


/**
 * Created by Administrator on 2017/1/20.
 */
public class Add {
    private String lock;
    public Add(String lock){
        super();
        this.lock=lock;
    }
    public void add(){
        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
