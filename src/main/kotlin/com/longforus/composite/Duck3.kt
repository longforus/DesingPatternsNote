package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/1  19:57.
 * Description :
 */
class Duck3 : Quackable {
    val observer = Observable(this)
    override fun register(observer: Observer) {
        this.observer.register(observer)
    }

    override fun startNotify() {
        this.observer.startNotify()
    }

    override fun quack() {
        println("duck3 quack")
        startNotify()
    }
}