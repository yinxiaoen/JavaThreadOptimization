package com.trans.test.theThreadTransDataTest.OneToOneTest;

/**
 * Created by Administrator on 2017/1/20.
 */
public class C {
    private MyStack myStack;
    public C(MyStack myStack){
        super();
        this.myStack=myStack;
    }
    public void popService(){
        System.out.println("pop="+myStack.pop());//往外取
    }
}
