package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/1  20:11.
 * Description :
 */
class DecoratrQuackableFactory(val ggjxj: Guaguajiaoxuejia?) : AbstractFactory {
    override fun getD1(): Quackable {
        val quackCounter = QuackCounter(Duck1())
        if (ggjxj != null) {
            quackCounter.register(ggjxj)
        }
        return quackCounter
    }

    override fun getD2(): Quackable {
        val quackCounter = QuackCounter(Duck2())
        if (ggjxj != null) {
            quackCounter.register(ggjxj)
        }
        return quackCounter
    }

    override fun getD3(): Quackable {
        val quackCounter = QuackCounter(Duck3())
        if (ggjxj != null) {
            quackCounter.register(ggjxj)
        }
        return quackCounter
    }


}