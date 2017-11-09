package com.longforus.bridge

/**
 * Created by XQ Yang on 2017/11/9  18:37.
 * Description :
 */
fun main(args: Array<String>) {
    val abstraction = RefinedAbstraction()
    abstraction.im = ConcreteImplmentorA()
    abstraction.operation()
    abstraction.im = ConcreteImplmentorB()
    abstraction.operation()
}