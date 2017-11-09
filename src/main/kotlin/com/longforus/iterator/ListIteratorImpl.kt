package com.longforus.iterator

/**
 * Created by XQ Yang on 2017/9/20  20:19.
 * Description :
 */
class ListIteratorImpl<T>(val list: List<T>): MyIterator<T> {

    var index:Int = -1

    override fun next(): T {
     return list[++index]
    }

    override fun remove(): T {
        if (list is MutableList) {
            return list.removeAt(index)
        } else {
            throw UnsupportedOperationException()
        }
    }

    override fun hasNext(): Boolean {
        return index<list.size-1
    }
}