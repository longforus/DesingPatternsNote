package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/1  20:04.
 * Description :
 */
class QuackCounter(var duck: Quackable):Quackable{

    override fun startNotify() {
       duck.startNotify()
    }

    override fun register(observer: Observer) {
       duck.register(observer)
    }

    companion object {
        var count = 0
    }
    override fun quack() {
        duck.quack()
        count++
    }
}