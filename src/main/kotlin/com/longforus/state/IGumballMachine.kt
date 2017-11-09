package com.longforus.state

/**
 * Created by XQ Yang on 2017/10/11  18:59.
 * Description :
 */
interface IGumballMachine {
    fun insert()
    fun retrieve()
    fun turnCrank()
    fun releaseBall()//如何限制这个方法只能被IState的子类调用?
}