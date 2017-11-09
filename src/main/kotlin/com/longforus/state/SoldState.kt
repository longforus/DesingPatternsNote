package com.longforus.state

/**
 * Created by XQ Yang on 2017/10/11  19:17.
 * Description :
 */
class SoldState(override var curStateStr: String, override var machine: GumballMachine) : IState {
    override fun insert() {
        println("正在出球")
    }

    override fun retrieve() {
        println("买都买了不能退了哦")
    }

    override fun turnCrank() {
        println("正在出球")
    }

    override fun dispense() {
        machine.releaseBall()
    }
}