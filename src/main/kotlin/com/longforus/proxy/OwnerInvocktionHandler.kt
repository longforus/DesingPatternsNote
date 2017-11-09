package com.longforus.proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 * Created by XQ Yang on 2017/10/16  19:48.
 * Description :
 */
class OwnerInvocktionHandler(val person: IPerson):InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        if (method == null) {
            return null
        }
        if (method.name == "setHotOrNot") {//不允许自己调用的方法
            throw IllegalStateException("not set")
        }else if (method.name.startsWith("get")||method.name.startsWith("set")) {
            return method.invoke(person,args)
        }
        return null
    }
}