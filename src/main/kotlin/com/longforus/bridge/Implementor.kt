package com.longforus.bridge

/**
 * Created by XQ Yang on 2017/11/9  18:33.
 * Description :
 */
interface Implementor {//实现类层次
    fun operationImpl()//如果Implementor结构发生了改变,那么只要它的实现进行修改就好了  不会影响到 Abstraction
}