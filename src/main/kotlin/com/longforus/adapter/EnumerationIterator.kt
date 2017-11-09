package com.longforus.adapter

import java.util.*

/**
 * Created by XQ Yang on 2017/9/7  19:12.
 * Description : 对象适配器模式
 */
class EnumerationIterator<T>(var enum:Enumeration<T>/*持有被适配对象的引用*/):MutableIterator<T> {//继承自客户要求的接口

    override fun remove() {
        throw UnsupportedOperationException()
    }

    override fun next(): T {
        return enum.nextElement()//转交给被适配对象
    }

    override fun hasNext(): Boolean {
         return  enum.hasMoreElements()
    }
}