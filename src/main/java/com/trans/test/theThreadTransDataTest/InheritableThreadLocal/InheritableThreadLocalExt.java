package com.trans.test.theThreadTransDataTest.InheritableThreadLocal;

import java.util.Date;

/**
 * Created by Administrator on 2017/1/23.
 */
public class InheritableThreadLocalExt extends  InheritableThreadLocal{
    @Override
    protected Object initialValue(){
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue){
        return parentValue+"我在子线程加的~！";
    }
}
