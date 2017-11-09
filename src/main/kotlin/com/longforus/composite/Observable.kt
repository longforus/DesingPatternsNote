package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/2  18:51.
 * Description :
 */
class Observable(val quackableObservable: QuackableObservable):QuackableObservable{
    val list = ArrayList<Observer>()
    override fun register(observer: Observer) {
        list.add(observer)
    }

    override fun startNotify() {
        for (observer in list) {
            observer.onUpdate(quackableObservable)
        }
    }

}