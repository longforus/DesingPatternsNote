package com.longforus.decorate

/**
 * Created by XQ Yang on 2017/10/30  18:51.
 * Description :
 */
interface IBeverage {
    var des:String
    var price:Double
    var size: Size
    fun cost():Double
}