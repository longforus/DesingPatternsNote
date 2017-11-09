package com.longforus.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by XQ Yang on 2017/10/18  19:34.
 * Description :
 */

class OtherHandler implements InvocationHandler {
    private IPerson mPerson;

    public OtherHandler(IPerson person) {
        mPerson = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method == null) {
            return null;
        }
        if (method.getName().startsWith("get")||method.getName().equals("setHotOrNot") ) {
            return method.invoke(mPerson, args);
        }else if (method.getName().startsWith("set")) {//别人不允许调用设置自身属性的方法
            throw new IllegalStateException("not set");
        }
        return null;
    }
}
