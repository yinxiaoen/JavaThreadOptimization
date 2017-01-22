package com.trans.test.theThreadTransDataTest.pipedInputOrOutput;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by Administrator on 2017/1/22.
 */
public class ReadData {

    public void readMethod(PipedInputStream input)
    {
        try {
            System.out.println("read :");
            byte[] byteArray=new byte[20];
            int readLength=input.read(byteArray);
            System.out.println("llll");
            while(readLength!=-1)
            {
                System.out.println("ssssss");
                String newData=new String(byteArray,0,readLength);
                System.out.println(newData);
                readLength=input.read(byteArray);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
