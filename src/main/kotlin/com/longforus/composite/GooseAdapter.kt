package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/1  20:00.
 * Description :
 */
class GooseAdapter(val goose: Goose):Quackable{
    val observer = Observable(this)
    override fun register(observer: Observer) {
       this.observer.register(observer)
    }

    override fun startNotify() {
      this.observer.startNotify()
    }

    override fun quack() {
        goose.jiao()
        startNotify()
    }
}