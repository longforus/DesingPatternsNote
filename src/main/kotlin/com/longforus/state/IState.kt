package com.longforus.state

/**
 * Created by XQ Yang on 2017/10/11  18:59.
 * Description :
 */
interface IState {
    var curStateStr:String
    var machine:GumballMachine
    fun insert()//定义所有的行为
    fun retrieve()//每一个state实现对象状态下的对应行为
    fun turnCrank()
    fun dispense()
}