package com.sync.test.moreSync.syncDuiXiangJianShiQi.tongBuDaiMaKuaiWenTi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/19.
 */
public class MyOneList {
    private List list=new ArrayList();
     public void add(String data)
    {
        synchronized (this){list.add(data);}
    };
     public int getSize()
    {
        synchronized (this){ return list.size();}

    };
}
