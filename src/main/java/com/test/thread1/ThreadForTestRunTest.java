package com.test.thread1;

/**
 * Created by Administrator on 2017/1/16.
 * .start()的顺序不代表运行的顺序
 */
public class ThreadForTestRunTest {
    public static void main(String []args){
        ThreadForTestRun t11= new ThreadForTestRun(1);
        ThreadForTestRun t12= new ThreadForTestRun(2);
        ThreadForTestRun t13= new ThreadForTestRun(3);
        ThreadForTestRun t14= new ThreadForTestRun(4);
        ThreadForTestRun t15= new ThreadForTestRun(5);
        ThreadForTestRun t16= new ThreadForTestRun(6);
        ThreadForTestRun t17= new ThreadForTestRun(7);
        ThreadForTestRun t18= new ThreadForTestRun(8);
        ThreadForTestRun t19= new ThreadForTestRun(9);
        ThreadForTestRun t110= new ThreadForTestRun(10);
        ThreadForTestRun t111= new ThreadForTestRun(11);
        ThreadForTestRun t112= new ThreadForTestRun(12);
        ThreadForTestRun t113= new ThreadForTestRun(13);
        ThreadForTestRun t114= new ThreadForTestRun(14);
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
        t110.start();
        t111.start();
        t112.start();
        t113.start();
        t114.start();



    }
}
