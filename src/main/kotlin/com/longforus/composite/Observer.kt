package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/2  18:48.
 * Description :
 */
interface Observer{
    fun onUpdate(quackable: QuackableObservable)
}