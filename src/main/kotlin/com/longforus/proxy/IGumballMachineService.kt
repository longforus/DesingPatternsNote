package com.longforus.proxy

import java.rmi.Remote
import java.rmi.RemoteException


/**
 * Created by XQ Yang on 2017/10/12  19:41.
 * Description :
 */
interface IGumballMachineService: Remote {
    @Throws(RemoteException::class) //使用注解标注可能抛出的exception
    fun getCount():Int
}