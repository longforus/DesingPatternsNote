package com.longforus

import com.longforus.compsite.CompsiteMenu
import com.longforus.iterator.MyIterator

/**
 * Created by XQ Yang on 2017/7/24  19:43.
 * Description :
 */

fun main(args: Array<String>) {
//  var result: Beverage = DarkRoast(Size.BIG)
//  result = Mocha(result)
//  result = Whip(result)
//  result = Whip(result)
//  println(result.cost())

//    val remoteControl = RemoteControl()//命令发送方
//    val light = Light()//具体的命令接收方
//    val lightOnCommand = LightOnCommand(light)//命令对象
//     remoteControl.slot = lightOnCommand//命令发送放只持有命令对象,具体的接收命令方和具体的动作不关心
//    remoteControl.onPressed()//发出命令
//    remoteControl.onRepeal()//撤销命令
//    val door = Door()
//    val doorOnCommand = DoorOnCommand(door = door)
//    remoteControl.slot = doorOnCommand//运行中也可以改变命令对象
//    remoteControl.onPressed()
//    remoteControl.onRepeal()

//    var vector:Vector<Int> = Vector()
//    vector.addElement(1)
//    vector.addElement(2)
//    vector.addElement(3)
//    vector.addElement(5)
//    var list = arrayListOf<Int>(6,7,8,9)
//    var itrator :MutableIterator<Int> =  EnumerationIterator<Int>(vector.elements())//面向接口不面向实现,所以要使用接口声明实现,传入被适配对象
//    while (itrator.hasNext()) {
//        println(itrator.next())
//    }
//    itrator = list.iterator()//同样的适配器接口调用
//    while (itrator.hasNext()) {
//        println(itrator.next())
//    }


//    var array = arrayOf("2","3","5","6")
//    var  list = listOf<String>("a","b","d","g")
//
//    var myIt:MyIterator<String> = ArrayIteratorImpl(array)
//    showIterator(myIt)//这里的方法就得到了复用
//     myIt = ListIteratorImpl(list)
//    showIterator(myIt)

//    var array = arrayOf("2", "3", "5", "6")
//    var array1 = arrayOf("a", "b", "d", "g")
//    var cmi = CompsiteMenuImpl(array, null)
//    var cmi1 = CompsiteMenuImpl(null, CompsiteMenuImpl(array1, null))
//    var carray = arrayOf(cmi, cmi1)
//    for (impl in carray) {
//        printImpl(impl)//使用统一的方式处理组合对象
//    }


//    val machine = GumballMachine(5)
//    Naming.rebind("//127.0.0.1/server",machine)
//    machine.retrieve()
//    machine.turnCrank()
//    machine.insert()
//    machine.retrieve()
//    machine.insert()
//    machine.turnCrank()
//    machine.insert()
//    machine.turnCrank()
//    machine.turnCrank()
//    machine.insert()
//    machine.insert()
//    machine.turnCrank()
//    machine.turnCrank()
//    machine.turnCrank()
//    machine.retrieve()
//    machine.insert()
//    machine.turnCrank()
//    machine.insert()
//    machine.turnCrank()

//    var person = Person("花儿","美眉")
//    val proxy = PersonProxy()
//    val otherProxy = proxy.getOtherProxy(person = person)
//    val owenProxy = proxy.getOwenProxy(person)
////    owenProxy.setHotOrNot(10)
//    otherProxy.setHotOrNot(1)
//    println(otherProxy.name)
//    otherProxy.gender = "haha"//不允许别人修改自己的属性

//    var result: Beverage = DarkRoast(Size.BIG)
//    result = Mocha(result)//装饰者持有被装饰者且可以多层嵌套装饰
//    result = Whip(result)
//    result = Whip(result)
//    println(result.cost())

val i = null
//    val i:String = "10"
    println(i as Int?)
    println(i as? Int)
}



fun add(a:Int,b:Int):Int = a+b

fun printImpl(impl: CompsiteMenu<String>) {
    val iterator = impl!!.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
    if (impl.subMenu != null) {
        printImpl(impl.subMenu!!)//递归遍历
    }
}

private fun showIterator(myIt: MyIterator<String>) {
    while (myIt.hasNext()) {
        println(myIt.next())
    }
}

