package com.longforus.bridge

/**
 * Created by XQ Yang on 2017/11/9  18:33.
 * Description :
 */
interface Abstraction {//抽象类层次
    var im:Implementor?//Implementor是Abstraction的一部分
    fun operation(){//如果Abstraction有无数的实现, 在Implementor发生扩展后,这些实现都无需更改
        im?.operationImpl()
    }
}