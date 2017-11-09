package com.longforus.iterator

/**
 * Created by XQ Yang on 2017/9/20  20:17.
 * Description :
 */
interface MyIterator<T> {
    fun hasNext():Boolean
    fun next():T
    fun remove():T
}