package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/2  18:47.
 * Description :
 */
interface QuackableObservable{
    fun register(observer: Observer)
    fun startNotify()
}