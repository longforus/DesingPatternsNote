package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/1  20:12.
 * Description :
 */
interface AbstractFactory {
    fun getD1():Quackable
    fun getD2():Quackable
    fun getD3():Quackable
}