package com.test.suspendAndResume;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Test {
    public static void main(String[] agrs) {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread() {
            public void run() {
                myObject.setValue("a", "aa");
            }

            ;
        };
        thread1.setName("a");
        thread1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread2 = new Thread() {
            public void run() {
                myObject.printUsernamePassword();
            }
        };
        thread2.start();
    }
}
