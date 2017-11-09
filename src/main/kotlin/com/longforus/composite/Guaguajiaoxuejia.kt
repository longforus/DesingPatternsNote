package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/2  19:21.
 * Description :呱呱叫学家  ヽ(°◇° )ノ
 */
class Guaguajiaoxuejia:Observer{

    override fun onUpdate(quackable: QuackableObservable) {
        println("$quackable  at quack")
    }

}