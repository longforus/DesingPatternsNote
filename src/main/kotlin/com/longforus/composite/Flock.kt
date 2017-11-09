package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/1  20:26.
 * Description :
 */
class Flock:Quackable{

    override fun startNotify() {
    }

    /**
     *  向flock注册观察者时 其实是向flock内的每一个元素注册观察者,所以把注册操作委托给每一个元素,如果当前遍历到的是一个Flock,它也做同样的事
     */
    override fun register(observer: Observer) {
        for (observable in list) {
            observable.register(observer)
        }
    }

    var list = mutableListOf<Quackable>()

    fun add(quackable: Quackable) {
        list.add(quackable)
    }

    override fun quack() {
        val iterator = list.iterator()
        while (iterator.hasNext()) {
            val next = iterator.next()
            next.quack()//把quack操作委托给每一个元素,在quack的时候会调用startNotify方法,这里不用再调用
        }
    }

}