package com.longforus.state

/**
 * Created by XQ Yang on 2017/10/11  19:17.
 * Description :
 */
class HasMoneyState(override var curStateStr: String, override var machine: GumballMachine) :IState {
    override fun insert() {
        machine.curMoneyCount++
        println("现在有${machine.curMoneyCount}个钱")
    }

    override fun retrieve() {
        machine.curMoneyCount--
        println("退了一个钱 还有${machine.curMoneyCount}个")
        if (machine.curMoneyCount<1) machine.curState = machine.noMoneyState else machine.curState=machine.hasMoneyState
    }

    override fun turnCrank() {
        machine.curState = machine.soldState
    }

    override fun dispense() {

    }
}