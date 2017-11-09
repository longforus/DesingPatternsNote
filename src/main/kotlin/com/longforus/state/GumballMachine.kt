package com.longforus.state

import com.longforus.proxy.IGumballMachineService
import java.rmi.RemoteException
import java.rmi.server.UnicastRemoteObject

/**
 * Created by XQ Yang on 2017/10/11  19:13.
 * Description :
 */

class GumballMachine @Throws(RemoteException::class) constructor(gumballCount: Int) : UnicastRemoteObject(), IGumballMachineService, IGumballMachine {

    override fun getCount(): Int {
        return curCount
    }

    lateinit var curState: IState
    var curCount: Int = gumballCount
    var curMoneyCount = 0
    val noMoneyState: IState = NoMoneyState("noMoney", this)//可以声明为static  放到别的类中  实现复用
    val hasMoneyState: IState = HasMoneyState("hasMoney", this)
    val soldOutState: IState = SoldOutState("soldOut", this)
    val soldState: IState = SoldState("sold", this)
    init {
        if (curCount > 0) curState = noMoneyState else soldOutState
    }
    override fun insert() {
        curState.insert()
    }

    override fun retrieve() {
        curState.retrieve()
    }

    override fun turnCrank() {
        curState.turnCrank()
        curState.dispense()
    }

    override fun releaseBall() {
        curMoneyCount--
        if (--curCount > 0) (if (curMoneyCount > 0) curState = hasMoneyState else curState = noMoneyState) else curState = soldOutState
        println("卖了一个球,还剩下${curCount}个")
    }


}