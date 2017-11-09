package com.longforus

/**
 * Created by XQ Yang on 2017/11/1  18:53.
 * Description :
 */
class Evaluation1(val positions: Int, val letters: Int)



data class Evaluation2(val positions: Int, val letters: Int)



fun main(args: Array<String>) {

    val sb = StringBuilder().apply {
        for (i in 0..9) {
            append(i)
        }
    }
    println(sb) // 0123456789
}

public inline fun <T> T.apply(block: T.() -> Unit): T {
    this.block()
    return this
}