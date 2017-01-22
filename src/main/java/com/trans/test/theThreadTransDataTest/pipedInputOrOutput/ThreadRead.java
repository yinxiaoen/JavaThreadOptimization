package com.trans.test.theThreadTransDataTest.pipedInputOrOutput;

import java.io.PipedInputStream;

/**
 * Created by Administrator on 2017/1/22.
 */
public class ThreadRead extends Thread{
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read,PipedInputStream input)
    {
        super();
        this.read=read;
        this.input=input;
    }
    @Override
    public void run(){
        read.readMethod(input);
    }
}
