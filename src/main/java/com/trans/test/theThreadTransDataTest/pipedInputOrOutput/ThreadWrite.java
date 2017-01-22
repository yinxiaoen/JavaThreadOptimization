package com.trans.test.theThreadTransDataTest.pipedInputOrOutput;

import java.io.PipedOutputStream;

/**
 * Created by Administrator on 2017/1/22.
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;
    public ThreadWrite(WriteData write,PipedOutputStream out)
    {
        super();
        this.write=write;
        this.out=out;
    }
    @Override
    public void run(){
        write.writeMethod(out);
    }
}
