package com.longforus.state

/**
 * Created by XQ Yang on 2017/10/11  19:17.
 * Description :
 */
class SoldOutState(override var curStateStr: String, override var machine: GumballMachine) : IState {
    override fun insert() {
        println("没有球了,别投了")
    }

    override fun retrieve() {
        if (machine.curMoneyCount < 1) {
            println("钱都没投退个毛")
        } else {
            throw IllegalStateException("没有球的状态其实有钱")
        }
    }

    override fun turnCrank() {
        println("没有球了,拉毛啊")
    }

    override fun dispense() {

    }
}