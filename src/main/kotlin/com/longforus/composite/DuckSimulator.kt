package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/1  20:00.
 * Description :
 */
fun main(args: Array<String>) {
    val ggjxj = Guaguajiaoxuejia()
    val simulator = DuckSimulator(ggjxj)
    simulator.simulat(DecoratrQuackableFactory(null))
    simulator.simulat(GooseFactory(ggjxj))
    println(QuackCounter.count)
}

class DuckSimulator(val ggjxj: Guaguajiaoxuejia) {
    fun simulat(q: Quackable) {
        q.quack()
    }
    fun simulat(f: AbstractFactory) {
        val flock = Flock()
        flock.add( f.getD1())
        flock.add(f.getD2())
        flock.add(f.getD3())
        flock.register(ggjxj)
        simulat(flock)
    }
    fun simulat(f: GooseAbstractFactory) {
        simulat(f.getGoose())
    }
}