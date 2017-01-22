package com.trans.test.theThreadTransDataTest.pipedInputOrOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by Administrator on 2017/1/22.
 *

 管道流:
 PipedInputStream
 void connect(PipedOutputStream src)
 使此管道输入流连接到管道输出流 src

 PipedOutputStream
 void connect(PipedInputStream snk)

 在JDK我们看到PipedInputStream中有管道缓冲区,用来接收数据

 管道流内部在实现时还有大量的对同步数据的处理
 管道输出流和管道输入流执行时不能互相阻塞,所以一般要开启独立线程分别执行
 顺便复习了多线程操作

 [示例]:管道流

*/
public class Run {
    public static void main(String[] args){
        try {
        WriteData writeData=new WriteData();
        ReadData readData=new ReadData();

        PipedInputStream inputStream=new PipedInputStream();
        PipedOutputStream outputStream=new PipedOutputStream();

        //inputStream.connect(outputStream);
            outputStream.connect(inputStream);
            ThreadRead threadRead=new ThreadRead(readData,inputStream);
            threadRead.start();
            Thread.sleep(4000);
            ThreadWrite threadWrite=new ThreadWrite(writeData,outputStream);
            threadWrite.start();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
