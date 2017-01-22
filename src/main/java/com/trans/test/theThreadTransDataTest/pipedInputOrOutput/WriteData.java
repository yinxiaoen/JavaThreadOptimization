package com.trans.test.theThreadTransDataTest.pipedInputOrOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by Administrator on 2017/1/22.
 */
public class WriteData {

    public void writeMethod(PipedOutputStream out)
    {
        try {
               System.out.println("write:");
               for(int i=0;i<300;i++){
                   String outData=""+(i+1);
                   out.write(outData.getBytes());
                   System.out.println(outData+" is write");
                }
            System.out.println("------------end-----------------");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
