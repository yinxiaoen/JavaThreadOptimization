package com.trans.test.theThreadTransDataTest.OneToOneTest;

/**
 * Created by Administrator on 2017/1/20.
 */
public class P {
    private MyStack myStack;
    public P(MyStack myStack){
        super();
        this.myStack=myStack;
    }
    public void pushService(){
        myStack.push();//往里放
    }
}
