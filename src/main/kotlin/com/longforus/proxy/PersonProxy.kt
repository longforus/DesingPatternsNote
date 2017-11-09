package com.longforus.proxy

import java.lang.reflect.Proxy

/**
 * Created by XQ Yang on 2017/10/16  20:07.
 * Description :
 */
class PersonProxy {
    fun getOwenProxy(person: IPerson):IPerson{
        return Proxy.newProxyInstance(person.javaClass.classLoader,person.javaClass.interfaces,OwnerInvocktionHandler(person = person)) as IPerson
    }
    fun getOtherProxy(person: IPerson):IPerson{
        return Proxy.newProxyInstance(person.javaClass.classLoader,person.javaClass.interfaces,OtherHandler(person)) as IPerson
    }

}