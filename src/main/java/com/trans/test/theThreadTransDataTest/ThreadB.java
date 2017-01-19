package com.trans.test.theThreadTransDataTest;

/**
 * Created by Administrator on 2017/1/19.
 */
public class ThreadB extends Thread {
    private MyList list;
    public ThreadB(MyList list){
        super();
        this.list=list;
    }
    @Override
    public void run(){
        try {
          while(true){
              System.out.println("list的长度"+list.size());
              if(list.size()==5){
                  System.out.println("==5了。线程B要退出了");
                  throw new InterruptedException();
              }
          }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
