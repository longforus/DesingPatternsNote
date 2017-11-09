package com.longforus.state

/**
 * Created by XQ Yang on 2017/10/11  19:14.
 * Description :
 */
class NoMoneyState(override var curStateStr: String, override var machine: GumballMachine) :IState {
    override fun insert() {
        machine.curMoneyCount++
        println("投入1个钱")
        machine.curState = machine.hasMoneyState
    }

    override fun retrieve() {
        if (machine.curMoneyCount < 1) {
            println("钱都没投退个毛")
        } else {
            throw IllegalStateException("没有钱的状态其实有钱")
        }
    }

    override fun turnCrank() {
        println("钱都没投拉个毛")
    }

    override fun dispense() {

    }
}