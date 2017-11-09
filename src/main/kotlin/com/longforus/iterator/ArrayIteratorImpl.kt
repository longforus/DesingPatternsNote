package com.longforus.iterator

/**
 * Created by XQ Yang on 2017/9/20  20:19.
 * Description :
 */
class ArrayIteratorImpl<T>(val array: Array<T>):MyIterator<T> {

    var index:Int = -1

    override fun next(): T {
     return array[++index]
    }

    override fun remove(): T {
        throw UnsupportedOperationException()
    }

    override fun hasNext(): Boolean {
        return index<array.size-1
    }
}