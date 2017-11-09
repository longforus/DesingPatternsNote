package com.longforus.proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 * Created by XQ Yang on 2017/10/16  19:48.
 * Description :
 */
class OtherInvocktionHandler(private var person: IPerson): InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        if (method == null) {
            return null
        }
        if (method.name.startsWith("get")||method.name == "setHotOrNot") {
            return method.invoke(person ,args)
        }else if (method.name.startsWith("set")) {
            throw IllegalStateException("not set")
        }
        return null
    }
}